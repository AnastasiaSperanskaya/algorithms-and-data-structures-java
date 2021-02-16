package dataStructures.tree;

public class Node {
    int key;
    Node left, right, parent;

    public Node(int item) {
        key = item;
        parent = left = right = null;
    }
}
