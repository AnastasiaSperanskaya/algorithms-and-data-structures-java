package dataStructures.tree;

public class BinaryTree {
    private Node root;

    public BinaryTree(int key) {
        root = new Node(key);
    }

    public BinaryTree() {
        root = null;
    }

    private void insertNode(Node root, int key) {
        if (root.key > key) {
            if(root.left == null) {
                root.left = new Node(key);
                root.left.parent = root;
            } else
                insertNode(root.left, key);
        } else if ((int)root.key < (int)key) {
            if(root.right == null) {
                root.right = new Node(key);
                root.right.parent = root;
            } else
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

    public void delete(int key) {
        Node node = searchNode(root, key);
        if (node == null) {
            System.out.println("The node with given key doesn't exist!");
        }
//        else if(node.parent == null) { //then it is root
//            root = null;
//        }
        else if(node.left == null && node.right == null) { //both children are null then just delete it
            if (node.parent != null) {
                if (node.parent.key > node.key)
                    node.parent.left = null;
                else
                    node.parent.right = null;
            } else {
                root = null;
            }
        } else if (node.left != null) { //node.right - any
            if (node.left.right == null) {
                if(node.parent != null) {
                    if (node.parent.key > node.key) { //node is a left child
                        node.parent.left = node.left;
                    } else { //node is a right child
                        node.parent.right = node.left;
                    }
                    node.left.parent = node.parent;
                } else {
                    root = node.left;
                }
                node.left.right = node.right;
            } else { //node.left.right != null - take the last right child in node.left.right branch add root case
                Node nodeRight = node.left.right;
                while (nodeRight.right != null) { //find sought node
                    nodeRight = nodeRight.right;
                }
                nodeRight.parent.right = nodeRight.left;
                nodeRight.right = node.right;
                nodeRight.left = node.left;
                node.left.parent = nodeRight;
                if (node.right != null) node.right.parent = nodeRight;
                nodeRight.parent = node.parent;
                if(node.parent != null) {
                    if (node.parent.key > node.key) { //node is a left child
                        node.parent.left = nodeRight;
                    } else { //node is a right child
                        node.parent.right = nodeRight;
                    }
                } else {
                    root = nodeRight;
                }
            }
        } else { //node.right != null && node.left = null - take the last left child in node.right branch (add root case (node.parent == null))
            if (node.parent != null) {
                if (node.parent.key > node.key) { //node is a left child
                    node.parent.left = node.right;
                } else { //node is a right child
                    node.parent.right = node.right;
                }
            } else {
                root = node.right;
            }
        }
    }

    public Node searchNode(Node root, int key) {
        if(root.key == key) {
            return root;
        } else if (root.key > key && root.left != null) {
            return searchNode(root.left, key);
        } else if (root.key < key && root.right != null) {
            return searchNode(root.right, key);
        } else
            return null;
    }

    public boolean search(int key) {
        if(root == null) {
            System.out.println("The tree is empty!");
            return false;
        } else {
            return (searchNode(root, key) != null);
        }
    }
}
