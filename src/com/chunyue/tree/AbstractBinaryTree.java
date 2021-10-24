package com.chunyue.tree;

import com.chunyue.Position;
import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
    // return the position of p's sibling (or null if no siblings exist)
    public Position<E> sibling(Position<E> p) {
        Position<E> parent = parent(p);
        if (parent == null) return null;
        if (p == left(parent)) return right(parent);
        else return left(parent);
    }

    // return the number of the children of position p
    @Override
    public int numChildren(Position<E> p) {
        int count = 0;
        if (left(p) != null) count ++;
        if (right(p) != null) count ++;
        return count;
    }

    // return an iterable collection of the positions representing p's children
    public Iterable<Position<E>> children(Position<E> p) {
        List<Position<E>> snapshot = new ArrayList<>(2);
        if (left(p) != null) snapshot.add(left(p));
        if (right(p) != null) snapshot.add(right(p));
        return snapshot;
    }
}
