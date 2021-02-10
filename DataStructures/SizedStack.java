package DataStructures;

import java.lang.String;

public class SizedStack<T> {
    private final int size;
    private final Object[] stackArray;
    private int top;

    public SizedStack(int size) {
        this.size = size;
        this.stackArray = new Object[size];
        this.top = -1;
    }

    public void push(T element){
        if(this.isFull()) {
            System.out.println("Stack overflow!");
        }
        else {
            this.stackArray[++this.top] = element;
        }
    }

    public void pop() {
        if(this.isEmpty()) {
            System.out.println("Stack has no elements!");
        }
        else {
            this.top--;
        }
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return (this.top == this.size - 1);
    }

    public Object getTop() {
        return this.stackArray[this.top];
    }

    public String toString() {
        String s = "";
        for(int i = 0; i <= this.top; i++) {
            s = s.concat(String.valueOf(this.stackArray[i]));
            s = s + ' ';
        }
        return s;
    }
}
