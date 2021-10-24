package com.chunyue.tree;

import com.chunyue.Position;

public interface BinaryTree<E> extends Tree<E>{
    // return the position of the left child of p
    Position<E> left(Position<E> p) throws IllegalArgumentException;

    // return the position of the right child of p
    Position<E> right(Position<E> p) throws IllegalArgumentException;

    // return the position of the sibling of p
    Position<E> sibling(Position<E> p) throws IllegalArgumentException;
}
