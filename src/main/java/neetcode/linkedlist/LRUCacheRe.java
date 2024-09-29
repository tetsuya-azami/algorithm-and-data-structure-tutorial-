package neetcode.linkedlist;

import java.util.HashMap;

public class LRUCacheRe {

    private int capacity;
    private HashMap<Integer, Node> cache;
    private Node dummyHead;
    private Node dummyTail;

    public LRUCacheRe(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.dummyHead = new Node(0, 0);
        this.dummyTail = new Node(0, 0);
        dummyHead.after = dummyTail;
        dummyTail.before = dummyHead;
    }

    /**
     * @param key キー
     * @return keyがある場合: keyに対応するvalue, keyがない場合: -1
     * 操作の後、keyが使用されたとみなされcacheの末尾に移動される
     */
    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            unlinkNode(node);
            moveToTail(node);
            return node.value;
        }

        return -1;
    }

    /**
     * @param key   キー
     * @param value keyがある場合: valueの更新
     *              keyがない場合: key, valueのペアをcacheに追加
     *              操作の後、keyが使用されたとみなされcacheの末尾に移動される
     *              cacheのcapacityが上限を超える場合、最後に使用された要素をcacheから削除してから要素の追加を行う
     */
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            unlinkNode(node);
            moveToTail(node);
        } else {
            if (cache.size() >= capacity) {
                removeHeadNode();
            }
            Node node = new Node(key, value);
            moveToTail(node);
            cache.put(key, node);
        }
    }

    private void removeHeadNode() {
        if (dummyHead.after == dummyTail) return;
        cache.remove(dummyHead.after.key);
        unlinkNode(dummyHead.after);
    }

    private void unlinkNode(Node node) {
        Node before = node.before;
        Node after = node.after;
        before.after = after;
        after.before = before;
    }

    private void moveToTail(Node node) {
        Node originalTail = dummyTail.before;
        originalTail.after = node;
        node.before = originalTail;
        node.after = dummyTail;
        dummyTail.before = node;
    }

    private class Node {
        Integer key;
        Integer value;
        Node before;
        Node after;

        public Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
            this.before = null;
            this.after = null;
        }
    }
}
