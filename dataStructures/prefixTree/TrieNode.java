package dataStructures.prefixTree;

import java.util.Collection;
import java.util.HashMap;

public class TrieNode {
    private String content = "";
    private HashMap<Character, TrieNode> children = new HashMap<>();
    public boolean isWord = false;

    public TrieNode() {}

    public TrieNode(String content) {
        this.content = content;
    }

    public void putChild(char c) {
        String newNodeContent = content + c;
        TrieNode newNode = new TrieNode(newNodeContent);
        this.children.put(c, newNode);
    }

    public TrieNode findChild(char c) {
        return this.children.get(c);
    }

    public Collection<TrieNode> getChildren() {
        return this.children.values();
    }

    public String getContent() {
        return this.content;
    }
}
