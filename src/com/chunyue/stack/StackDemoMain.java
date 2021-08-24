package com.chunyue.stack;

public class StackDemoMain {
    public static void main(String[] args) {
        arrayStackDemo();
    }

    public static void arrayStackDemo(){
        ArrayStack<Integer> arrayStack = new ArrayStack(20);
        arrayStack.push(23);
        arrayStack.push(25);
        arrayStack.push(67);
        arrayStack.push(43);
        System.out.println("The arrayStack looks like this: " + arrayStack);
        System.out.println("Peeking the top of the stack: " + arrayStack.peek());
        System.out.println("The arrayStack looks like this: " + arrayStack);
        System.out.println("Popping the stack: " + arrayStack.pop());
        System.out.println("The arrayStack looks like this: " + arrayStack);
    }
}
