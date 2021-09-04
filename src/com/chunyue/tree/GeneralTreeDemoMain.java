package com.chunyue.tree;

public class GeneralTreeDemoMain {
    public static void main(String[] args) {
        MapBasedGeneralTree<String> myTree = new MapBasedGeneralTree<>();
        myTree.add("root", "organism");
        myTree.add("organism", "plant");
        myTree.add("organism", "animal");
        myTree.add("organism", "mushroom");
        myTree.add("animal", "spine-animal");
        myTree.add("animal", "spineless-animal");
        myTree.add("spine-animal", "fish");
        myTree.add("spine-animal", "mammal");
        myTree.add("mammal", "cat");
        myTree.add("mammal", "cow");
        myTree.add("mammal", "human");
        System.out.println("----- getting parent------");
        System.out.println("parent of fish: " + myTree.getParent("fish"));
        System.out.println("parent of animal: " + myTree.getParent("animal"));
        System.out.println("------ getting children -----");
        System.out.println("children of animal: " + myTree.getChildren("animal"));
        System.out.println("children of mammals: " + myTree.getChildren("mammal"));
        System.out.println("------ getting siblings ------");
        System.out.println("siblings of cat: " + myTree.getSiblings("cat"));
        System.out.println("------ getting ancestors ------");
        System.out.println("ancestors of human: " + myTree.getAncestors("human"));
        System.out.println("------ getting descendants -----");
        System.out.println("descendants of mammal: " + myTree.getDescendant("mammal"));
        System.out.println("descendants of animal: " + myTree.getDescendant("animal"));
    }
}
