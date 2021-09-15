package lesson2;

import java.util.Objects;

public class LinkedL<E> implements List<E> {

    Node<E> first;
    Node<E> last;
    private int size;

    @Override
    public E get(int index) {
        return Objects.requireNonNull(findNode(index)).item;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = findNode(index);
        if (node != null) {
            node.item = element;
        }
        return node != null ? node.item : null;
    }


    @Override
    public boolean add(E e) {
        Node<E> current = last;
        Node<E> newNode = new Node<>(e, current, null);
        last = newNode;
        if (current == null) {
            first = newNode;
        } else {
            current.next = newNode;
        }

        size++;

        return true;
    }

    @Override
    public boolean remove(int index) {
        Node<E> node = findNode(index);
        if (node != null) {
            if (index == 0) {
                first = first.next;
            } else {
                node.prev.next = node.next;
            }

        }

        return node != null;
    }

    @Override
    public boolean remove(Object o) {
        remove(indexOf(o));
        return true;
    }

    //TODO
    @Override
    public void clear() {

    }

    //TODO
    @Override
    public boolean hasNext() {
        return false;
    }

    //TODO
    @Override
    public void add(int index, E element) {


    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {

        while (first != null) {
            if (first.item.equals(o)) {
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
        Node<E> f = first;
        int i = 0;
        while (f != null) {
            if (f.item.equals(o)) {
                return i;
            }
            i++;
            f = f.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        Node<E> f = first;
        StringBuilder builder = new StringBuilder();
        while (f != null) {
            builder.append(f);
            f = f.next;
        }

        builder.delete(builder.lastIndexOf(">"), builder.length());

        return builder.toString();
    }


    private Node<E> findNode(int index) {
        Node<E> f = first;
        int i = 0;
        while (f != null) {
            if (i == index) {
                return f;
            }
            f = f.next;
            i++;
        }
        return null;
    }

    private static class Node<E> {
        E item;
        Node<E> prev;
        Node<E> next;

        Node(E item, Node<E> previous, Node<E> next) {
            this.item = item;
            this.prev = previous;
            this.next = next;
        }

        @Override
        public String toString() {
            return item.toString() + " > ";
        }
    }


}
