package com.chunyue.stack;

import java.util.Arrays;
import java.util.Stack;

public class ArrayStack<E> {
    public static final int CAPACITY = 100;
    private E[] data;
    private int t = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() {return t+1;}

    public boolean isEmpty() {
        return (t==-1);
    }

    public void push (E element) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = element;
    }

    public E peek(){
        if (isEmpty()) return null;
        return data[t];
    }

    public E pop(){
        if (isEmpty()) return null;
        E popedElement = data[t];
        data[t] = null; //dereference to help gc
        t--;
        return popedElement;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
