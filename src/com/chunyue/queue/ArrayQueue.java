package com.chunyue.queue;

public class ArrayQueue<E> implements Queue<E>{

    public static final int CAPACITY = 20;
    private E[] data;
    private int front =  0;
    private int sz = 0;

    public ArrayQueue(int capacity) {
        this.data = (E[]) new Object[capacity];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    @Override
    public int size() {
        return this.sz;
    }

    @Override
    public boolean isEmpty() {
        return (this.sz == 0);
    }

    @Override
    public void enqueue(E element) throws IllegalStateException {
        if (this.size() == this.data.length) throw new IllegalStateException("Queue is currently full");
        int pos = (this.front + this.sz) % this.data.length;
        this.data[pos] = element;
        this.sz++;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return this.data[front];
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E dequeuedElement = this.data[front];
        this.data[front] = null;
        this.front = (this.front + 1) % this.data.length;
        this.sz --;
        return dequeuedElement;
    }

    @Override
    public String toString() {
        if (isEmpty()) return null;
        int currPos = this.front;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        stringBuilder.append(this.data[currPos]);
        for (int i = 1; i < this.size(); i++){
            stringBuilder.append(" ,");
            stringBuilder.append(this.data[(currPos + i) % this.data.length]);
        }
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}
