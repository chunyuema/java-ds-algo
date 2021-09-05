package com.chunyue.tree;

import com.chunyue.Position;

import java.util.Iterator;

public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {

    protected static class Node<E> implements Position<E> {
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        public Node(E element, Node<E> parent, Node<E> left, Node<E> right) {
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        @Override
        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
    }

    // factory function to create a new node for storing element
    protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right){
        return new Node<E>(e, parent, left, right);
    }

    protected Node<E> root = null;
    private int size = 0;

    public LinkedBinaryTree() {
    }

    protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node)) throw new IllegalArgumentException("Not a valid position type");
        Node<E> node = (Node<E>) p;
        if (node.getParent() == node) throw new IllegalArgumentException("p is no longer in the tree");
        return node;
    }

    @Override
    public Position<E> root() {
        return this.root;
    }

    @Override
    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getParent();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    // TODO: NEED TO TAKE CARE OF THIS LATER
    @Override
    public Iterable<Position<E>> positions() {
        return null;
    }

    @Override
    public Position<E> left(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getLeft();
    }

    @Override
    public Position<E> right(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getRight();
    }

    public Position<E> addRoot(E e) throws IllegalStateException {
        if (!(isEmpty())) throw new IllegalStateException("Tree is not empty: cannot add root");
        this.root = createNode(e, null, null, null);
        this.size = 1;
        return root;
    }

    public Position<E> addLeft(Position<E> p, E e) throws IllegalArgumentException{
        Node<E> parent = validate(p);
        if (parent.getLeft() != null) throw new IllegalArgumentException("A left child already exists");
        Node<E> leftChild = createNode(e, parent, null, null);
        parent.setLeft(leftChild);
        this.size ++;
        return leftChild;
    }

    public Position<E> addRight(Position<E> p, E e) throws IllegalArgumentException{
        Node<E> parent = validate(p);
        if (parent.getRight() != null) throw new IllegalArgumentException("A right child already exists");
        Node<E> rightChild = new Node<>(e, parent, null, null);
        parent.setRight(rightChild);
        return rightChild;
    }

    public E set(Position<E> p, E e) throws IllegalArgumentException{
        Node<E> node = validate(p);
        E temp = node.getElement();
        node.setElement(e);
        return temp;
    }
}
