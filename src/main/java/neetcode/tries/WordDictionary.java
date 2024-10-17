package neetcode.tries;

class WordDictionary {

    private WordDictionaryNode root;

    public WordDictionary() {
        this.root = new WordDictionaryNode();
    }

    private class WordDictionaryNode {
        private boolean isEnd;
        private WordDictionaryNode[] children;

        public WordDictionaryNode() {
            this.isEnd = false;
            this.children = new WordDictionaryNode[26];
        }
    }

    public void addWord(String word) {
        WordDictionaryNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new WordDictionaryNode();
            }
            cur = cur.children[c - 'a'];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, WordDictionaryNode root) {
        WordDictionaryNode cur = root;

        for (int i = index; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for (WordDictionaryNode child : cur.children) {
                    if (child != null && dfs(word, i + 1, child)) return true;
                }
                return false;
            } else {
                if (cur.children[c - 'a'] == null) return false;
                cur = cur.children[c - 'a'];
            }
        }

        return cur.isEnd;
    }
}