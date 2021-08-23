package com.chunyue.linkedlist;

public class LinkedListDemoMain {
    public static void main(String[] args) {
        // singlyLinkedListDemo();
        // circularLinkedListDemo();
        // doublyLinkedListDemo();
        cloningSLL();
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

        SinglyLinkedList<Integer> anotherIntegerSLinkedList = new SinglyLinkedList<>();
        anotherIntegerSLinkedList.addFirst(3);
        anotherIntegerSLinkedList.addFirst(4);
        System.out.println("The second SLL is " + anotherIntegerSLinkedList);
        System.out.println("Is it the same as the one before? " + anotherIntegerSLinkedList.equals(integerSinglyLinkedList));
    }

    public static void circularLinkedListDemo(){
        CircularLinkedList<Integer> integerCircularLinkedList = new CircularLinkedList<>();
        System.out.println("Initial integer CLL looks like: " + integerCircularLinkedList);
        integerCircularLinkedList.addFirst(4);
        integerCircularLinkedList.addLast(3);
        integerCircularLinkedList.addFirst(23);
        System.out.println("After some numbers, CLL looks like: " + integerCircularLinkedList);
        integerCircularLinkedList.rotate();
        System.out.println("After rotation, CLL looks like: " + integerCircularLinkedList);
        integerCircularLinkedList.removeFirst();
        System.out.println("Removed the first number: " + integerCircularLinkedList);
        System.out.println("The first number is: " + integerCircularLinkedList.first());
        System.out.println("The last number is: " + integerCircularLinkedList.last());
    }

    public static void doublyLinkedListDemo(){
        DoublyLinkedList<Integer> integerDoublyLinkedList = new DoublyLinkedList<>();
        integerDoublyLinkedList.addFirst(3);
        integerDoublyLinkedList.addFirst(4);
        integerDoublyLinkedList.addFirst(9);
        integerDoublyLinkedList.addLast(67);
        System.out.println("Initial doubly linked list: " + integerDoublyLinkedList);
        integerDoublyLinkedList.removeLast();
        integerDoublyLinkedList.removeFirst();
        System.out.println("After removing the last and the first element: " + integerDoublyLinkedList);
        System.out.println("The first element: " + integerDoublyLinkedList.first());
        System.out.println("The last element: " + integerDoublyLinkedList.last());
    }

    public static void cloningSLL(){
        SinglyLinkedList<Person> personSinglyLinkedList = new SinglyLinkedList<>();
        Person p1 = new Person("chunyue");
        Person p2 = new Person("alex");
        personSinglyLinkedList.addFirst(p1);
        personSinglyLinkedList.addFirst(p2);
        System.out.println("person sll looks like: " + personSinglyLinkedList);

        try {
            SinglyLinkedList<Person> copiedPersonSLL = personSinglyLinkedList.clone();
            System.out.println("copied person sll looks like: " + copiedPersonSLL);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
