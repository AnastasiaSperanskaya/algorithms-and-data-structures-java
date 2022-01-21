package dataStructures.prefixTree;

public class Trie {
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currentNode = root;
        for( int i = 0;  i < word.length(); i++ ) {
            char current = word.charAt(i);

            if(currentNode.findChild(current) == null) {
                currentNode.putChild(current);
            }

            currentNode = currentNode.findChild(current);
        }
        currentNode.isWord = true;
    }

    public TrieNode findNode(String word) {
        TrieNode currentNode = root;
        for( int i = 0;  i < word.length(); i++ ) {
            char current = word.charAt(i);
            if(currentNode.findChild(current) == null) {
                return null;
            } else {
                currentNode = currentNode.findChild(current);
            }
        }
        return currentNode.isWord ? currentNode : null;
    }

    public boolean find(String word) {
        return findNode(word) != null;
    }

    private void printWords(TrieNode node) {
        if (node.getChildren() != null) {
            for (TrieNode trieNode : node.getChildren()) {
                printWords(trieNode);
                if(trieNode.isWord) {
                    System.out.println(trieNode.getContent());
                }
            }
        } else {
            System.out.println(node.getContent());
        }
    }

    private void deleteWord(String word, TrieNode node, int index) {
        if(!node.getContent().equals(word)) {
            if(node.findChild(word.charAt(index + 1)) != null) {
                deleteWord(word, node.findChild(word.charAt(index + 1)), index + 1);
                if(node.getChildren() == null && !node.isWord) {
                    node = null;
                }
            }
        } else if(node.getContent().equals(word)) {
            if (node.getChildren() == null) {
                node = null;
            } else {
                node.isWord = false;
            }
        }
    }

    public void delete(String word) {
        deleteWord(word, root.findChild(word.charAt(0)), 0);
    }

    public void print() {
        printWords(root);
    }

    public boolean startsWith(String prefix) {
        TrieNode currentNode = root;
        for( int i = 0;  i < prefix.length(); i++ ) {
            char current = prefix.charAt(i);
            if(currentNode.findChild(current) == null) {
                return false;
            }
            currentNode = currentNode.findChild(current);
        }
        return true;
    }
}
