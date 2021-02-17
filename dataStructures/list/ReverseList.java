package dataStructures.list;

public class ReverseList<T> {
    public void reverse(LinkedList<T> list) {
        LinkedList.Node<T> first = list.head;
        LinkedList.Node<T> second = list.head.next;
        LinkedList.Node<T> third = second.next;

        first.next = null;
        second.next = first;

        LinkedList.Node<T> current = third;
        LinkedList.Node<T> previous = second;

        while (current != null) {
            LinkedList.Node<T> next = current.next;
            current.next = previous;

            previous = current;
            current = next;
        }

        list.head = previous;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insertAtEnd(3);
        list.insertAtEnd(5);
        list.insertAtEnd(8);
        list.insertAtEnd(0);
        list.insertAtEnd(56);
        list.insertAtEnd(7);
        list.printList();
        ReverseList<Integer> parser = new ReverseList<Integer>();
        parser.reverse(list);
        list.printList();
    }
}
