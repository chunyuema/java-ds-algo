package com.chunyue.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBasedGeneralTree<E> {

    private Map<E, E> map = new HashMap<>();
    private Map<E, List<E>> map2 = new HashMap<>();

    public void add(E parent, E element){
        this.map.put(element, parent);
        List<E> list = this.map2.get(parent);
        if (list == null){
            list = new ArrayList<>();
            this.map2.put(parent, list);
        }
        list.add(element);
    }

    public E getParent(E element){
        return this.map.get(element);
    }

    public List<E> getChildren(E element){
        return this.map2.get(element);
    }

    public List<E> getSiblings(E element){
        E parent = this.getParent(element);
        List<E> list = this.getChildren(parent);
        List<E> sibilings = new ArrayList<>();
        if (list != null){
            sibilings.addAll(list);
            sibilings.remove(element);
        }
        return sibilings;
    }

    public List<E> getAncestors(E element){
        E parent = this.getParent(element);
        if (parent == null) return new ArrayList<>();
        List<E> list = this.getAncestors(parent);
        list.add(parent);
        return list;
    }

    public List<E> getDescendant(E element){
        List<E> descendants = new ArrayList<>();
        List<E> children = this.getChildren(element);
        if (children == null) return descendants;
        for (E child : children){
            List<E> temp = this.getDescendant(child);
            descendants.add(child);
            descendants.addAll(temp);
        }
        return descendants;
    }
}
