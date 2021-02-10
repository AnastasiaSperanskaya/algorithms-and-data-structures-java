package DataStructures;

class Main {
    public static void main(String[] args) {

        DynamicQueue<Integer> dynamicQueue = new DynamicQueue<Integer>();

        dynamicQueue.enqueue(2);
        dynamicQueue.enqueue(3);
        dynamicQueue.enqueue(245);
        dynamicQueue.display();
        dynamicQueue.dequeue();
        dynamicQueue.display();

        /*

        Queue<Integer> queue = new Queue<Integer>(4);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.display();

        SizedStack<Integer> sizedStack = new SizedStack<Integer>(10);
        sizedStack.push(23);
        sizedStack.push(12);
        sizedStack.pop();
        System.out.println(sizedStack.toString());
        sizedStack.push(12);
        sizedStack.pop();
        sizedStack.push(333);
        System.out.println(sizedStack.toString());

        SizedStack<String> sizedStack2 = new SizedStack<String>(3);
        sizedStack2.push("hello");
        sizedStack2.push("hi");
        sizedStack2.pop();
        sizedStack2.push("blah");
        sizedStack2.push("hehehe");
        System.out.println(sizedStack2.toString());

        StackList<Integer> stackList = new StackList<Integer>();
        stackList.push(12);
        stackList.push(45);
        stackList.display();

        */
    }
}
