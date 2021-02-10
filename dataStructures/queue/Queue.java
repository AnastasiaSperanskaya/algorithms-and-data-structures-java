package dataStructures.queue;

public class Queue<T> {
    private final Object[] data;
    private int head;
    private int tail;
    private final int capacity;
    private int size;          // current size of the queue

    Queue(int cap)
    {
        data = new Object[cap];
        capacity = cap;
        head = 0;
        tail = -1;
        size = 0;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty!\n Couldn't extract element");
            return;
        }

        System.out.println("Removing " + data[head]);

        head = (head + 1) % capacity;
        size--;
    }

    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("OverFlow\nCouldn't add element");
            return;
        }

        System.out.println("Inserting " + item);

        tail = (tail + 1) % capacity;
        data[tail] = item;
        size++;
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("UnderFlow\nCouldn't return head element");
            return null;
        }
        return data[head];
    }

    public int size() {
        return size;
    }

    public Boolean isEmpty() {
        return (size() == 0);
    }

    public Boolean isFull() {
        return (size() == capacity);
    }

    public void display() {
        for (int i = head; i <= tail; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }
}
