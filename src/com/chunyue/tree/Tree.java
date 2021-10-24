package com.chunyue.tree;

import com.chunyue.Position;

import java.util.Iterator;

public interface Tree<E> extends Iterable<E> {
    // return the position of root node
    Position<E> root();

    // return the position of parent of position p
    Position<E> parent(Position<E> p) throws IllegalArgumentException;

    // return the iterable collection containing the children of position p
    Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException;

    // return the number of children at position p
    int numChildren(Position<E> p) throws IllegalArgumentException;

    // return true if the position p has at least one child
    boolean isInternal(Position<E> p) throws IllegalArgumentException;

    // return true if the position p has no child
    boolean isExternal(Position<E> p) throws IllegalArgumentException;

    // return true if position p is the root of the tree
    boolean isRoot(Position<E> p);

    // returns the number of positions in the tree
    int size();

    // return true if the tree does not contain any positions
    boolean isEmpty();

    // return an iterator for all elements such that the tree itself is iterable
    Iterator<E> iterator();

    // return a collection of all the positions
    Iterable<Position<E>> positions();
}
