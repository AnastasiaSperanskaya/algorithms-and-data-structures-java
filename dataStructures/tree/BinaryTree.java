package dataStructures.tree;

public class BinaryTree {
    public Node root;

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

    public void deleteNode(int key) {
        Node node = new Node(key);
    }

    public int searchNode(int key) {
        return 0;
    }

    public void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(2);
    }
}
