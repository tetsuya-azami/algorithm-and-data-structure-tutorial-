package neetcode.tries;

import java.util.HashMap;
import java.util.Map;

public class PrefixTreeRe {
    private final Node root;

    public PrefixTreeRe() {
        this.root = new Node(false, new HashMap<>());
    }

    public void insert(String word) {
        Node cur = root;
        for (char c : word.toCharArray()) {
            cur.children.putIfAbsent(c, new Node(false, new HashMap<>()));
            cur = cur.children.get(c);
        }

        cur.isEnd = true;
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

    private static class Node {
        private Boolean isEnd;
        private final Map<Character, Node> children;

        public Node(Boolean isEnd, Map<Character, Node> children) {
            this.isEnd = isEnd;
            this.children = children;
        }
    }
}
