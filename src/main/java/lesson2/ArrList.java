package lesson2;

import lombok.Data;

import java.util.Arrays;
import java.util.NoSuchElementException;

@Data
public class ArrList<E> implements List<E> {

    private Object[] arr;
    private final int DEFAULT_CAPACITY = 10;
    private int cursor = 0;

    public ArrList() {
        this.arr = new Object[DEFAULT_CAPACITY];
    }

    public ArrList(int capacity) {
        this.arr = new Object[capacity];
    }

    @Override
    public E get(int index) {
        if (arr[index] == null) throw new NoSuchElementException("There is no this element in collection");
        return (E) arr[index];
    }

    @Override
    public E set(int index, E element) {
        arr[index] = element;
        return (E) arr[index];
    }

    @Override
    public boolean add(E e) {
        growArray();
        this.arr[cursor] = e;
        cursor++;

        return true;
    }

    @Override
    public void add(int index, E element) {
        growArray();
        if (cursor - index >= 0) System.arraycopy(arr, index, arr, index + 1, cursor - index);
        arr[index] = element;
        cursor++;
    }

    @Override
    public boolean remove(int index) {
        arr[index] = null;
        cursor--;
        System.arraycopy(arr, index + 1, arr, index, cursor - index);
        arr = Arrays.copyOf(arr, cursor);
        return true;

    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            return remove(indexOf(o));
        } else return false;
    }

    @Override
    public void clear() {
        arr = new Object[size()];
    }

    @Override
    public boolean hasNext() {
        return cursor != arr.length;
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public boolean contains(Object o) {
        return Arrays.asList(arr).contains(o);
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(o)) {
                return i;
            }
        }
        return 0;
    }

    private void growArray() {
        if (cursor == arr.length) {
            arr = Arrays.copyOf(arr, arr.length + 1);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
