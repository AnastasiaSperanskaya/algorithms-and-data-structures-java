package dataStructures.queue;

public class DynamicQueue<T> {
    Object[] data;
    int head = 0;
    int tail = -1;
    int currentSize = 0;

    public DynamicQueue() {
        data = new Object[1];
    }

    public void enqueue(T item) {
        if (isFull()) { increaseCapacity(); }

        tail++;
        if(tail >= data.length && currentSize != data.length) {
            tail = 0;
        }
        data[tail] = item;
        currentSize++;
    }

    public int size() {
        return currentSize;
    }

    public T peek() {
        return (T) data[head];
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow! Unable to remove element from Queue");
        } else {
            head++;
            if(head > data.length-1) {
                head = 0;
            }
            currentSize--;
        }
    }

    public boolean isFull() {
        return currentSize == data.length;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    private void increaseCapacity() {
        int newCapacity = this.data.length + 1;
        Object[] newDataArray = new Object[newCapacity];
        int tmpHead = head;
        int index = -1;

        do {
            newDataArray[++index] = this.data[tmpHead];
            tmpHead++;
            if (tmpHead == this.data.length) {
                tmpHead = 0;
            }
        } while (currentSize != index + 1);

        this.data = newDataArray;
        this.head = 0;
        this.tail = index;
    }

    public void display() {
        for (int i = head; i <= tail; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }
}
