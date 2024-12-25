package neetcode.tries;

import java.util.HashMap;
import java.util.Map;

public class PrefixTreeRe {
    private Node root;

    public PrefixTreeRe() {
        this.root = new Node(false, new HashMap<>());
    }

    public void insert(String word) {
        Node cur = root;
        int index = 0;
        while (index < word.length()) {
            char c = word.charAt(index);
            if (cur.children.containsKey(c)) {
                Node nextNode = cur.children.get(c);
                if (index == word.length() - 1) {
                    nextNode.isEnd = true;
                }
                cur = nextNode;
            } else {
                cur.children.put(
                        c,
                        new Node(index == word.length() - 1, new HashMap<>())
                );
                cur = cur.children.get(c);
            }
            index++;
        }
    }

    public boolean search(String word) {
        Node cur = root;
        for (char c : word.toCharArray()) {
            if (!cur.children.containsKey(c)) return false;
            cur = cur.children.get(c);
        }

        return cur.isEnd;
    }

    public boolean startsWith(String prefix) {
        Node cur = root;
        for (char c : prefix.toCharArray()) {
            if (!cur.children.containsKey(c)) return false;
            cur = cur.children.get(c);
        }

        return true;
    }

    private class Node {
        private Boolean isEnd;
        private Map<Character, Node> children;

        public Node(Boolean isEnd, Map<Character, Node> children) {
            this.isEnd = isEnd;
            this.children = children;
        }
    }
}
