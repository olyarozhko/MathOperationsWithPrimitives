package hw9_collections_own;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class MyLinkedList<E> implements List<E>, Deque<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public MyLinkedList() {

    }

    public MyLinkedList(Collection<? extends E> collection) {
        this();
        addAll(collection);
    }


    @Override
    public void addFirst(E newElement) {
        Node<E> next = this.first;
        this.first = new Node<>(null, newElement, next);
        if (next != null) {
            next.prev = this.first;
        }
        if (this.last == null) {
            this.last = this.first;
        }
        size++;

    }

    @Override
    public void addLast(E newElement) {
        Node<E> prev = this.last;
        this.last = new Node<>(prev, newElement, null);
        if (prev != null) {
            prev.next = this.last;
        }
        if (this.first == null) {
            this.first = this.last;
        }
        size++;
    }

    @Override
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        c.forEach(this::add);
        return true;
    }

    @Override
    public void add(int index, E element) {
        Objects.checkIndex(index, size + 1);
        if (index == 0) {
            addFirst(element);
            return;
        }
        if (index == size) {
            addLast(element);
            return;
        }
        Node<E> newNode = new Node<>(null, element, null);
        Node<E> current = this.first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (size < 0) {
            throw new IllegalStateException("Size can't be negative!");
        }
        return size() == 0;
    }

    @Override
    public boolean contains(Object element) {
        Node<E> current = first;
        for (int i = 0; i < size; i++) {
            if (current.item.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean remove(@NotNull Object element) {
        if (!contains(element)) {
            return false;
        }
        Node<E> current = first;
        Node<E> toRemove = null;

        for (int i = 0; i < size; i++) {
            if (current.item.equals(element)) {
                toRemove = current;
                break;
            }
            current = current.next;
        }

        Node<E> prevNode = current.prev;
        Node<E> nextNode = current.next;
        if (prevNode != null) {
            prevNode.next = Objects.requireNonNull(toRemove).next;
        } else {
            this.first = Objects.requireNonNull(toRemove).next;
        }
        if (nextNode != null) {
            nextNode.prev = toRemove.prev;
        } else {
            this.last = toRemove.prev;
        }
        toRemove.clear();
        size--;
        return true;

    }

    @Override
    public void clear() {
        if (size == 0) {
            return;
        }
        Node<E> current = first;
        while (current != null) {
            Node<E> next = current.next;
            current.clear();
            current = next;
        }
        size = 0;
    }

    @Override
    public E getFirst() {
        return this.first.item;
    }

    @Override
    public E getLast() {
        return this.last.item;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public boolean offerFirst(E o) {
        return false;
    }

    @Override
    public boolean offerLast(E o) {
        return false;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }


    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }


    @Override
    public boolean offer(Object o) {
        return false;
    }


    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Iterator descendingIterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    @Override
    public void push(Object o) {

    }

    @Override
    public E pop() {
        return null;
    }


    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }


    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    @Override
    public String toString() {
        Node<E> element = this.first;
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + element + ", ";
            element = element.next;
        }
        return s;
    }


    private static class Node<E> {
        private E item;
        private Node<E> next;
        private Node<E> prev;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public void clear() {
            this.item = null;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return "{" + item +
                    '}';
        }
    }
}
