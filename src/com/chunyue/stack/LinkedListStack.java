package com.chunyue.stack;

import com.chunyue.linkedlist.SinglyLinkedList;

public class LinkedListStack<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    public LinkedListStack() {
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(E element){
        list.addFirst(element);
    }

    public E peek(){
        return list.first();
    }

    public E pop(){
        return list.removeFirst();
    }

    @Override
    public String toString() {
        return this.list.toString();
    }
}
