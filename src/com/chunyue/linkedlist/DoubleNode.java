package com.chunyue.linkedlist;

public class DoubleNode<E> {
    private E element;
    private DoubleNode<E> prev;
    private DoubleNode<E> next;

    public DoubleNode(E element, DoubleNode<E> prev, DoubleNode<E> next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public DoubleNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode<E> prev) {
        this.prev = prev;
    }

    public DoubleNode<E> getNext() {
        return next;
    }

    public void setNext(DoubleNode<E> next) {
        this.next = next;
    }
}
