package com.chunyue.linkedlist;

import java.util.ArrayList;

public class CircularLinkedList<E> {
    private Node<E> tail = null;
    private int size = 0;

    public CircularLinkedList() {
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public E first(){
        if (isEmpty()) return null;
        return tail.getNext().getElement();
    }

    public E last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void rotate(){
        if (tail != null){
            tail = tail.getNext();
        }
    }

    public void addFirst(E element){
        if (this.size == 0){
            this.tail = new Node<>(element, null);
            this.tail.setNext(this.tail);
        } else {
            Node<E> newNode = new Node<>(element, this.tail.getNext());
            this.tail.setNext(newNode);
        }
        this.size ++;
    }

    public void addLast(E element){
        addFirst(element);
        this.tail = this.tail.getNext();
    }

    public E removeFirst(){
        if (isEmpty()) return null;
        Node<E> head = this.tail.getNext();
        if (head == this.tail) this.tail = null;
        else tail.setNext(head.getNext());
        this.size--;
        return head.getElement();
    }

    @Override
    public String toString() {
        ArrayList<E> elements = new ArrayList<>();
        if (isEmpty()) return elements.toString();
        Node<E> currentNode = this.tail.getNext();
        for (int i=0; i<this.size; i++){
            elements.add(currentNode.getElement());
            currentNode = currentNode.getNext();
        }
        return elements.toString();
    }
}
