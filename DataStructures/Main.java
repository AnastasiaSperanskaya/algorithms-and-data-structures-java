package DataStructures;

class Main {
    public static void main(String[] args) {
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
