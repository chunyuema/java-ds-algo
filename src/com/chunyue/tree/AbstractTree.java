package com.chunyue.tree;

import com.chunyue.Position;

public abstract class AbstractTree<E> implements Tree<E> {
    public boolean isInternal(Position<E> p) {return numChildren(p) > 0;}
    public boolean isExternal(Position<E> p) {return numChildren(p) == 0;}
    public boolean isRoot(Position<E> p) {return p == root();}
    public boolean isEmpty() {return size() == 0;}

    // return the level of nodes from p to its root of the tree
    public int depth(Position<E> p){
        if (isRoot(p)) return 0;
        else return 1 + depth(parent(p));
    }

    // return the height of the subtree that is rooted at the position p
    public int height(Position<E> p){
        int height = 0;
        for (Position<E> c : children(p)){
            height = Math.max(height, 1 + height(c));
        }
        return height;
    }
}
