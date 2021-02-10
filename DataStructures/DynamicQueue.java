package DataStructures;

public class DynamicQueue<T> {
    Object[] data;
    int head = 0;
    int tail = -1;
    private int capacity = 2;
    int currentSize = 0;

    public DynamicQueue() {
        data = new Object[this.capacity];
    }

    public void enqueue(T item) {
        if (isFull()) {
            //System.out.println("Queue is full, increasing capacity...");
            increaseCapacity();
        }
        tail++;
        if(tail >= data.length && currentSize != data.length) {
            tail = 0;
        }
        data[tail] = item;
        currentSize++;
        //System.out.println("Adding: " + item);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow! Unable to remove element from Queue");
        } else {
            head++;
            if(head > data.length-1) {
                //System.out.println("removed: "+data[head -1]);
                head = 0;
            } else {
                //System.out.println("removed: "+data[head -1]);
            }
            currentSize--;
        }
    }

    public boolean isFull() {
        boolean status = false;
        if (currentSize == data.length) {
            status = true;
        }
        return status;
    }

    public boolean isEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    private void increaseCapacity() {
        int newCapacity = this.data.length + 1;
        Object[] newDataArray = new Object[newCapacity];
        int tmpHead = head;
        int index = -1;

        while(true) {
            newDataArray[++index] = this.data[tmpHead];
            tmpHead++;
            if(tmpHead == this.data.length) {
                tmpHead = 0;
            }
            if(currentSize == index+1) {
                break;
            }
        }

        this.data = newDataArray;
        //System.out.println("New array capacity: " + this.data.length);
        this.head = 0;
        this.tail = index;
    }

    public void display() {
        for (int i = head; i <= tail; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }
}
