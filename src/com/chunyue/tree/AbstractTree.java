package com.chunyue.tree;

import com.chunyue.Position;

// provide some concrete implementations for certain methods; serve as the base class for more concrete
// implementation of trees
public abstract class AbstractTree<E> implements Tree<E> {

    public boolean isInternal(Position<E> p) {return numChildren(p) > 0;}
    public boolean isExternal(Position<E> p) {return numChildren(p) == 0;}
    public boolean isRoot(Position<E> p) {return p == root();}
    public boolean isEmpty() {return size() == 0;}

    // return the level of nodes from p to its root of the tree -> number of ancestors of p other than p itself
    // time complexity: O(n), n = number of positions in the tree
    public int depth(Position<E> p){
        if (isRoot(p)) return 0;
        else return 1 + depth(parent(p));
    }

    // return the height of the subtree that is rooted at the position p -> equal to the max depths of its positions
    // time complexity: O(n^2), bad implementation
    public int heightBad(Position<E> p){
        int h = 0;
        for (Position<E> c : positions()){
            h = Math.max(h, depth(c));
        }
        return h;
    }

    // time complexity: O(n^2), good implementation
    public int height(Position<E> p){
        int h = 0;
        for (Position<E> c: children(p)){
            h = Math.max(h, height(c));
        }
        return h;
    }
}
