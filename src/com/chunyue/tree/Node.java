package com.chunyue.tree;

public class Node<E extends Integer> {
    private E item;
    private Node left; // left tree address
    private Node right; // right tree address

    public Node(E item) {
        this.item = item;
    }

    // add node
    public void addNode(Node node) {
        if (node.item.intValue() < this.item.intValue()) {
            if (this.left == null) this.left = node;
            else this.left.addNode(node);
        } else {
            if (this.right == null) this.right = node;
            else this.right.addNode(node);
        }
    }

    // in order traversal
    public void inOrderTraversal() {
        if (this.left != null) this.left.inOrderTraversal();
        System.out.println(this.item);
        if (this.right != null) this.right.inOrderTraversal();
    }
}
