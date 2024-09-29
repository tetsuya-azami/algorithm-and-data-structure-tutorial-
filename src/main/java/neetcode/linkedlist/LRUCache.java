package neetcode.linkedlist;

import java.util.HashMap;

class LRUCache {
    private final int capacity;
    private final HashMap<Integer, Node> cache;
    private final Node left;
    private final Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        left = new Node(0, 0);
        right = new Node(0, 0);
        left.next = right;
        right.prev = left;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insertBefore(right, node);
            return node.value;
        }

        return -1;
    }

    public void put(int key, int value) {
        Node node;
        if (cache.containsKey(key)) {
            node = cache.get(key);
            node.value = value;
            remove(node);
        } else {
            node = new Node(key, value);
        }
        while (cache.size() >= capacity) {
            remove(left.next);
        }
        insertBefore(right, node);
        this.cache.put(key, node);
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
        cache.remove(node.key);
    }

    private void insertBefore(Node right, Node node) {
        Node prev = right.prev;
        prev.next = node;
        node.next = right;
        right.prev = node;
        node.prev = prev;
        cache.put(node.key, node);
    }

    private class Node {
        Node prev;
        Node next;
        Integer key;
        Integer value;

        public Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
            prev = null;
            next = null;
        }
    }
}