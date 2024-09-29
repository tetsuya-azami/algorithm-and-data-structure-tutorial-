package neetcode.linkedlist;

import java.util.LinkedHashMap;

class LRUCache {

    private final int capacity;
    private LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>();
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Integer value = cache.get(key);
            cache.remove(key);
            cache.put(key, value);
            return value;
        }

        return -1;
    }

    public void put(int key, int value) {
        cache.remove(key);
        while (cache.size() >= capacity) {
            Integer first = cache.keySet().iterator().next();
            cache.remove(first);
        }
        cache.put(key, value);
    }
}