package com.chunyue.linkedlist;

public class LinkedListDemoMain {
    public static void main(String[] args) {
        singlyLinkedListDemo();
    }

    public static void singlyLinkedListDemo(){
        SinglyLinkedList<Integer> integerSinglyLinkedList = new SinglyLinkedList<>();
        System.out.println("Initial integer SLL looks like: " + integerSinglyLinkedList);
        integerSinglyLinkedList.addFirst(4);
        integerSinglyLinkedList.addLast(3);
        integerSinglyLinkedList.addFirst(23);
        System.out.println("After some numbers, SLL looks like: " + integerSinglyLinkedList);
        integerSinglyLinkedList.removeFirst();
        System.out.println("Removed the first number: " + integerSinglyLinkedList);
        System.out.println("The first number is: " + integerSinglyLinkedList.first());
        System.out.println("The last number is: " + integerSinglyLinkedList.last());
    }
}
