package com.chunyue.linkedlist;

import java.util.ArrayList;

public class DoublyLinkedList<E>{
    private DoubleNode<E> header;
    private DoubleNode<E> trailer;
    private int size = 0;

    public DoublyLinkedList() {
        this.header = new DoubleNode<>(null, null, null);
        this.trailer = new DoubleNode<>(null, this.header, null);
        this.header.setNext(this.trailer);
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public E first(){
        if (isEmpty()) return null;
        return this.header.getNext().getElement();
    }

    public E last(){
        if (isEmpty()) return null;
        return this.trailer.getPrev().getElement();
    }

    public void addFirst(E element){
        addBetween(element, this.header, this.header.getNext());
    }

    public void addLast(E element){
        addBetween(element, this.trailer.getPrev(), this.trailer);
    }

    public E removeFirst(){
        if (isEmpty()) return null;
        return remove(this.header.getNext());
    }

    public E removeLast(){
        if (isEmpty()) return null;
        return remove(this.trailer.getPrev());
    }


    @Override
    public String toString() {
        ArrayList<E> elements = new ArrayList<>();
        if (isEmpty()) return elements.toString();
        DoubleNode<E> currentNode = this.header.getNext();
        while (currentNode != this.trailer){
            elements.add(currentNode.getElement());
            currentNode = currentNode.getNext();
        }
        return elements.toString();
    }

    private void addBetween(E element, DoubleNode<E> predecessor, DoubleNode<E> successor){
        DoubleNode<E> newNode = new DoubleNode<>(element, predecessor, successor);
        predecessor.setNext(newNode);
        successor.setPrev(newNode);
        this.size ++;
    }

    private E remove(DoubleNode<E> nodeToRemove){
        DoubleNode<E> predecessor = nodeToRemove.getPrev();
        DoubleNode<E> successor = nodeToRemove.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        this.size--;
        return nodeToRemove.getElement();
    }

}
