package dataStructures.tree;

public class BinaryTree {
    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    public BinaryTree() {
        root = null;
    }

    private void insertNode(Node root, int key) {
        if (root.key > key) {
            if(root.left == null)
                root.left = new Node(key);
            else
                insertNode(root.left, key);
        } else if ((int)root.key < (int)key) {
            if(root.right == null)
                root.right = new Node(key);
            else
                insertNode(root.right, key);
        }
    }

    public void insert(int key) {
        if(root == null) {
            root = new Node(key);
        } else {
            insertNode(root, key);
        }
    }

    public void deleteNode(Node root, int key) {
        Node node = new Node(key);
    }

    public int searchNode(Node root, int key) {
        if(root.key == key) {
            return 1;
        } else if (root.key > key && root.left != null) {
            return searchNode(root.left, key);
        } else if (root.key < key && root.right != null) {
            return searchNode(root.right, key);
        } else
            return 0;
    }

    public int search(int key) {
        if(root == null) {
            System.out.println("The tree is empty!");
            return 0;
        } else {
            return searchNode(root, key);
        }
    }

    public void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(2);
    }
}
