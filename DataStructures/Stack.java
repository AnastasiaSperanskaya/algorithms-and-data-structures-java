package DataStructures;

import java.util.Arrays;
import java.lang.String;

public class Stack {
    private final int size;
    private final int[] stackArray;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public void push(int element){
        if(this.isFull()) {
            System.out.println("Stack overflow!");
        }
        else {
            this.stackArray[++this.top] = element;
        }
    }

    public int pop() {
        if(this.isEmpty()) {
            System.out.println("Stack has no elements!");
            return 0;
        }
        else {
            return this.stackArray[this.top--];
        }
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return (this.top == this.size - 1);
    }

    public int getTop() {
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
