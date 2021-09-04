package com.chunyue.tree;

public class BinarySearchTree<E extends Integer> {
    private Node root;

    public void add(E element){
        Node<E> node = new Node<>(element);
        if (this.root == null) this.root = node;
        else this.root.addNode(node);
    }

    public void sort(){
        if (this.root == null) return;
        this.root.inOrderTraversal();
    }
}
