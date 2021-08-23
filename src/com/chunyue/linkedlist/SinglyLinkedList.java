package com.chunyue.linkedlist;

import java.util.ArrayList;

public class SinglyLinkedList<E>{
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    // construct the initially empty list here
    public SinglyLinkedList() {
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public E first(){
        if (isEmpty()) return null;
        return this.head.getElement();
    }

    public E last(){
        if (isEmpty()) return null;
        return this.tail.getElement();
    }

    public void addFirst(E element){
        this.head = new Node<>(element, this.head);
        if (size == 0) this.tail = this.head;
        this.size++;
    }

    public void addLast(E element){
        Node<E> newNode = new Node<>(element, null);
        if (isEmpty()) this.head = newNode;
        else this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }

    public E removeFirst(){
        if (isEmpty()) return null;
        E firstElement = this.head.getElement();
        this.head = this.head.getNext();
        this.size --;
        if (size==0){
            tail = null;
        }
        return firstElement;
    }

    @Override
    public String toString() {
        ArrayList<E> elements = new ArrayList<>();
        Node<E> currentNode = this.head;
        while (currentNode != null) {
            elements.add(currentNode.getElement());
            currentNode = currentNode.getNext();
        }
        return elements.toString();
    }

    public boolean equals(Object o){
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        SinglyLinkedList other = (SinglyLinkedList) o;
        if (this.size != other.size) return false;
        Node currentNodeThis = this.head;
        Node currentNodeOther = other.head;
        while (currentNodeThis != null){
            if (!(currentNodeThis.getElement().equals(currentNodeOther.getElement()))) return false;
            currentNodeThis = currentNodeThis.getNext();
            currentNodeOther = currentNodeOther.getNext();
        }
        return true;
    }
}
