package com.chunyue.list;

public class ArrayList<E> implements List<E>{
    public static final int CAPACITY = 16;
    private E[] data;
    private int size = 0;

    public ArrayList(){ this(CAPACITY); }

    public ArrayList(int capacity){
        data = (E[]) new Object[capacity];
    }

    protected void checkIndex(int i, int n) throws IndexOutOfBoundsException{
        if (i < 0 || i>= n){
            throw new IndexOutOfBoundsException("Illegal index: " + i + ".");
        }
    }

    public int size(){ return this.size; }

    public boolean isEmpty(){ return this.size == 0; }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        checkIndex(i, this.size);
        return this.data[i];
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        checkIndex(i, this.size);
        E temp = this.data[i];
        this.data[i] = e;
        return temp;
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException {
        checkIndex(i, this.size+1);
        if (size == this.data.length){
            throw new IllegalStateException("Array is full...");
        }
        for (int k = this.size -1; k >= i; k--){
            this.data[k+1] = this.data[k];
        }
        this.data[i] = e;
        this.size ++;
    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, this.size);
        E temp = this.data[i];
        for (int k = i; i< this.size-1; k++){
            this.data[k] = this.data[k+1];
        }
        this.data[this.size-1] = null;
        this.size --;
        return temp;
    }

    // for testing purposes
    public E[] getList(){
        return this.data;
    }
}
