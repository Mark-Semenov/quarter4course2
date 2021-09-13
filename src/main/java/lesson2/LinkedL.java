package lesson2;

import lombok.Data;

@Data
public class LinkedL<E> implements List<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public boolean add(E e) {
        size++;
        return e != null;
    }


    private Node<E> addFirst(E e) {
        return null;
    }

    private Node<E> addLast(E e) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(Object o) {

        return true;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {

        while (first != null) {
            if (first.getItem().equals(o)) {
                return true;
            }
            first = first.prev;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }


    @Data
    static class Node<E> {
        private E item;
        private Node<E> prev;
        private Node<E> next;

        public Node(E item, Node<E> previous, Node<E> next) {
            this.item = item;
            this.prev = previous;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node {" +
                    "item=" + item + "\n" +
                    ", previous=" + prev + "\n" +
                    ", next=" + next +
                    '}';
        }


    }
}
