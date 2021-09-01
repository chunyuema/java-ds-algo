package com.chunyue;

public interface Position<E> {
    E getElement() throws IllegalStateException;
}
