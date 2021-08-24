package com.chunyue.queue;

import com.chunyue.linkedlist.SinglyLinkedList;

public class LinkedListQueue<E> implements Queue<E>{
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    public LinkedListQueue() {
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void enqueue(E element) {
        this.list.addLast(element);
    }

    @Override
    public E first() {
        return this.list.first();
    }

    @Override
    public E dequeue() {
        return this.list.removeFirst();
    }
}
