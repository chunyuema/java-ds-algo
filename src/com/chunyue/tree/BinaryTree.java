package com.chunyue.tree;

import com.chunyue.Position;
import javafx.geometry.Pos;

public interface BinaryTree<E> extends Tree<E>{
    Position<E> left(Position<E> p) throws IllegalArgumentException;
    Position<E> right(Position<E> p) throws IllegalArgumentException;
    Position<E> sibling(Position<E> p) throws IllegalArgumentException;
}
