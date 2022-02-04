package com.spartaglobal.factory.model;
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySort implements Sorter {
    Node root;
    // Utilises the sorter interface and converts the sorted array to a string
    @Override
    public String sort(int[] ints) {
        return Arrays.toString(adapter(ints));
    }

    public int[] adapter(int[] ints){
        // The adapter helps fulfill the different input requirement the binary search tree has, compared to merge and bubble
        // create array list
        ArrayList<Integer> integer = new ArrayList<>();
        BinarySort theTree = new BinarySort();
        for (int i = 0; i < ints.length; i++) {
            theTree.addNode(ints[i]);
        }
        // Traversing the binary tree to add to the arrayList
        theTree.inOrderTraverseTree(theTree.root, integer);
        // Placing values from array list into int[]
        int[] out = new int[integer.size()];
        int i = 0;
        for (int value:integer){
            out[i] = value;
            i++;
        }
        return out;
    }






    // Creates nodes from the input array, in the binary tree format
    public void addNode(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    // traverses completed nodes and adds them to the arrayList
    public void inOrderTraverseTree(Node focusNode, ArrayList<Integer> integer) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild, integer);
            integer.add(focusNode.key);
            inOrderTraverseTree(focusNode.rightChild, integer);
        }
    }

// Creates the key for the node
class Node {
    int key;
    Node leftChild;
    Node rightChild;
    Node(int key) {
        this.key = key;
    }
}
}