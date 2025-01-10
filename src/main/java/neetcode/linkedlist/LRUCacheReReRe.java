package neetcode.linkedlist;

import java.util.HashMap;

public class LRUCacheReReRe {
    private Node left;
    private Node right;
    private HashMap<Integer, Node> cache;
    private int capacity;

    public LRUCacheReReRe(int capacity) {
        this.cache = new HashMap<>();
        this.capacity = capacity;
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        this.left.next = right;
        this.right.prev = left;
    }

    private void removeFromLinkedList(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void addLast(Node node) {
        Node prev = right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = right;
        right.prev = node;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            removeFromLinkedList(node);
            addLast(node);

            return node.value;
        }

        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            removeFromLinkedList(cache.get(key));
        }

        Node node = new Node(key, value);
        cache.put(key, node);
        addLast(node);

        if (cache.size() > capacity) {
            Node lru = left.next;
            removeFromLinkedList(lru);
            cache.remove(lru.key);
        }
    }

    private class Node {
        private int key;
        private int value;
        private Node prev;
        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
