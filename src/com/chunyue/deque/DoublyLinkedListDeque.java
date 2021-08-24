package com.chunyue.deque;

import com.chunyue.linkedlist.DoublyLinkedList;

public class DoublyLinkedListDeque<E> implements Deque<E>{
    private DoublyLinkedList<E> list = new DoublyLinkedList<>();

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public E first() {
        return this.list.first();
    }

    @Override
    public E last() {
        return this.list.last();
    }

    @Override
    public void addFirst(E element) {
        this.list.addFirst(element);
    }

    @Override
    public void addLast(E element) {
        this.list.addLast(element);
    }

    @Override
    public E removeFirst() {
        return this.list.removeFirst();
    }

    @Override
    public E removeLast() {
        return this.list.removeLast();
    }
}
