package dataStructures.stack;

import dataStructures.queue.DynamicQueue;

public class TwoQueuesStack<T> {
    DynamicQueue<T> queue1, queue2;
    T topElement;

    public TwoQueuesStack() {
        queue1 = new DynamicQueue<T>();
        queue2 = new DynamicQueue<T>();
    }

    public void pop() {
        while (queue1.size() > 1) {
            queue2.enqueue(queue1.peek());
            topElement = queue1.peek();
            queue1.dequeue();
        }
        queue1.dequeue();
        queue1 = queue2;
        queue2 = new DynamicQueue<T>();
    }

    public void push(T data) {
        queue1.enqueue(data);
        topElement = data;
    }

    public T peek() {
        return topElement;
    }

    public void display() {
        queue1.display();
    }

    public static void main(String[] args) {
        TwoQueuesStack<Integer> twoQueuesStack = new TwoQueuesStack<Integer>();
        twoQueuesStack.push(2);
        twoQueuesStack.push(3);
        twoQueuesStack.push(4);
        twoQueuesStack.push(5);
        twoQueuesStack.display();
        twoQueuesStack.pop();
        System.out.println(twoQueuesStack.peek());
        twoQueuesStack.display();
        twoQueuesStack.pop();
        twoQueuesStack.display();
    }
}
