package dataStructures;
import dataStructures.hashTable.HashTable;
import dataStructures.prefixTree.Trie;
import dataStructures.prefixTree.TrieNode;
import dataStructures.tree.BinaryTree;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        Trie trie = new Trie();
        trie.insert("cold");
        trie.insert("colder");
        trie.insert("coldest");
        trie.print();
        System.out.println(trie.find("cold"));
        System.out.println(trie.find("coldest"));
        trie.delete("cold");
        trie.delete("colder");
        trie.delete("coldest");
        System.out.println(trie.find("cold"));
        trie.print();

//        String word = "Hello";
//        System.out.println(word.length());
//        for( int i = 0;  i < word.length(); i++ ) {
//            char current = word.charAt(i);
//            System.out.println(current);
//        }

//        HashMap<Integer, String> table = new HashMap<Integer, String>();
//        TrieNode node = new TrieNode();
//        node.putChild('a');
//        node.findChild('a');
//
//
//
//        table.put(1, "a");
//        table.put(2, "b");
//        table.put(3, "c");
//        table.put(4, "d");
//
//        System.out.println(table.get(6));


//        BinaryTree tree = new BinaryTree(5);
//        tree.insert(2);
//        tree.insert(3);
//        tree.insert(1);
//        tree.insert(4);
//        tree.insert(0);
//        System.out.println(tree.search(3));
//        System.out.println(tree.search(1));
//        System.out.println(tree.search(0));
//        tree.delete(2);
//        System.out.println(tree.search(2));
//        System.out.println(tree.search(0));
//        System.out.println(tree.search(3));

        /*
        HashTable<Integer, Integer> hashTable = new HashTable<Integer, Integer>();
        hashTable.addPair(2,3);
        hashTable.addPair(3,4);
        System.out.println(hashTable.getValueByKey(2));
        hashTable.deleteByKey(2);
        System.out.println(hashTable.getValueByKey(2));

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(8);
        linkedList.deleteAtPosition(2);
        linkedList.printList();

        DynamicQueue<Integer> dynamicQueue = new DynamicQueue<Integer>();

        dynamicQueue.enqueue(2);
        dynamicQueue.enqueue(3);
        dynamicQueue.enqueue(245);
        dynamicQueue.display();
        dynamicQueue.dequeue();
        dynamicQueue.display();

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
