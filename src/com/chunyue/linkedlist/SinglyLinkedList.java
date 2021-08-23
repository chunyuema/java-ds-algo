package com.chunyue.linkedlist;

import java.util.ArrayList;

public class SinglyLinkedList<E> implements Cloneable{
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
    } {}

    public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
        // use inherited clone method on Object class to make a shallow copy;
        SinglyLinkedList<E> copy = (SinglyLinkedList<E>) super.clone();
        if (this.size > 0) {
            copy.head = new Node<>(this.head.getElement(), null);
            Node<E> currentNode = this.head.getNext();
            Node<E> copyTail = copy.head;
            while (currentNode != null){
                Node<E> newNode = new Node<>(currentNode.getElement(), null);
                copyTail.setNext(newNode);
                copyTail = newNode;
                currentNode = currentNode.getNext();
            }
        }
        return copy;
    }
}
