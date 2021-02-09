package DataStructures;

import java.util.Arrays;
import java.lang.String;

public class Stack {
    private int size;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public void push(int element){
        this.stackArray[++this.top] = element;
    }

    public int pop() {
        return this.stackArray[this.top--];
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

class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Stack stack = new Stack(10);
        stack.push(23);
        stack.push(12);
        stack.pop();
        System.out.println(stack.toString());
        stack.push(12);
        stack.pop();
        stack.push(333);
        System.out.println(stack.toString());
    }
}
