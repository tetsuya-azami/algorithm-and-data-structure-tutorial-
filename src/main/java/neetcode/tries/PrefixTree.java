package neetcode.tries;

class PrefixTree {
    private PrefixTreeNode root;

    public PrefixTree() {
        root = new PrefixTreeNode('#');
    }

    private class PrefixTreeNode {
        private char value;
        private boolean isWord;
        private PrefixTreeNode[] children;

        public PrefixTreeNode(char value) {
            this.value = value;
            this.isWord = false;
            this.children = new PrefixTreeNode[26];
        }
    }

    public void insert(String word) {
        PrefixTreeNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new PrefixTreeNode(c);
            }
            cur = cur.children[c - 'a'];
        }
        cur.isWord = true;
    }

    public boolean search(String word) {
        PrefixTreeNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                return false;
            }
            cur = cur.children[c - 'a'];
        }
        
        return cur.isWord;
    }

    public boolean startsWith(String prefix) {
        PrefixTreeNode cur = root;
        for (char c : prefix.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                return false;
            }
            cur = cur.children[c - 'a'];
        }

        return true;
    }
}

