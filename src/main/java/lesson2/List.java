package lesson2;

public interface List<E> {
    E get(int index);

    E set(int index, E element);

    boolean add(E e);

    void add(int index, E element);

    boolean remove(int index);

    boolean remove(Object o);

    void clear();

    boolean hasNext();

    int size();

    boolean contains(Object o);

    boolean isEmpty();

    int indexOf(Object o);

}
