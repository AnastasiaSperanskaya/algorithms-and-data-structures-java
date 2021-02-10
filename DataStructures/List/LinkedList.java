package DataStructures.List;

public class LinkedList<T> {
    Node<T> head;

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T d) {
            data = d;
            next = null;
        }
    }

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return (this.head == null);
    }

    public void insertAtEnd(T data) {
        Node<T> new_node = new Node<T>(data);
        new_node.next = null;

        if (isEmpty()) {
            this.head = new_node;
        }
        else {
            Node<T> last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void printList() {
        Node<T> currNode = this.head;

        System.out.print("\nLinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("\n");
    }

    public void deleteByKey(T key)
    {
        Node<T> currNode = this.head, prev = null;

        // If head node itself holds the key to be deleted
        if (currNode != null && currNode.data == key) {
            this.head = currNode.next;
            return;
        }

        // If the key is somewhere other than at head
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {
            prev.next = currNode.next;
        }

        if (currNode == null) {
            System.out.println(key + " not found");
        }
    }

    public void deleteAtPosition(int index)
    {
        Node<T> currNode = this.head, prev = null;

        // If index is 0, then head node itself is to be deleted
        if (index == 0 && currNode != null) {
            this.head = currNode.next;
        }

        // If the index is greater than 0 but less than the size of LinkedList
        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
                prev.next = currNode.next;
                break;
            }
            else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        if (currNode == null) {
            System.out.println(index + " position element not found");
        }
    }
}
