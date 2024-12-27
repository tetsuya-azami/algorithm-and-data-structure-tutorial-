package neetcode.tries;

import java.util.HashMap;
import java.util.Map;

public class WordDictionaryRe {
    private final TryNode root;

    public WordDictionaryRe() {
        root = new TryNode('#', false, new HashMap<>());
    }

    public void addWord(String word) {
        TryNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.children.containsKey(c)) {
                cur = cur.children.get(c);
                continue;
            }

            TryNode node = new TryNode(c, false, new HashMap<>());
            cur.children.put(c, node);
            cur = node;
        }

        cur.isEnd = true;
    }

    public boolean search(String word) {
        return dfs(root, word, 0);
    }

    private boolean dfs(TryNode cur, String word, int i) {
        if (i == word.length()) return cur.isEnd;
        if (word.charAt(i) == '.') {
            for (TryNode node : cur.children.values()) {
                if (dfs(node, word, i + 1)) return true;
            }
            return false;
        }
        if (cur.children.containsKey(word.charAt(i))) {
            return dfs(cur.children.get(word.charAt(i)), word, i + 1);
        }

        return false;
    }


    private static class TryNode {
        Character c;
        Boolean isEnd;
        Map<Character, TryNode> children;

        public TryNode(Character c, Boolean isEnd, Map<Character, TryNode> children) {
            this.c = c;
            this.isEnd = isEnd;
            this.children = children;
        }
    }
}