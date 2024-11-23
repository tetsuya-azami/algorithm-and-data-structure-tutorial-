package neetcode.linkedlist;

import java.util.HashMap;

public class LRUCacheReRe {
    private int capacity;
    private HashMap<Integer, Node> cache;
    private Node left;
    private Node right;

    public LRUCacheReRe(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        left.next = right;
        right.prev = left;
    }

    /**
     * time complexity O(1)
     *
     * @param key key to get value
     * @return value cooresponding to the key.-1 if the key is not exists.
     */
    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insertLast(node);
            return node.value;
        }
        return -1;
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insertLast(Node node) {
        Node prev = right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = right;
        right.prev = node;
    }

    /**
     * Update the value of the key if the key exists.s
     * Otherwise, add the key-value pair to the cache.
     * If the introduction of the new pair causes the cache to exceed its capacity, remove the least recently used key.
     * time complexity O(1)
     *
     * @param key   key
     * @param value value
     */
    public void put(int key, int value) {
        if (this.cache.containsKey(key)) {
            remove(this.cache.get(key));
        }
        Node node = new Node(key, value);
        this.cache.put(key, node);
        insertLast(node);
        if (this.cache.size() > capacity) {
            this.cache.remove(left.next.key);
            remove(left.next);
        }
    }

    private class Node {
        Integer key;
        Integer value;
        Node next;
        Node prev;

        public Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }
}
