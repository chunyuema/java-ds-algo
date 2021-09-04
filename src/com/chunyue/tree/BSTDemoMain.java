package com.chunyue.tree;

public class BSTDemoMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(12);
        bst.add(2);
        bst.add(23);
        bst.add(13);
        bst.add(4);
        bst.add(90);
        bst.sort();
    }
}
