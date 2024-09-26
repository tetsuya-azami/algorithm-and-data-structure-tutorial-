package neetcode.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TimeMap {
    private Map<String, List<Pair<Integer, String>>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        this.map.computeIfAbsent(key, e -> new ArrayList<>()).add(new Pair<>(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> pairs = this.map.get(key);
        if (pairs == null || pairs.isEmpty()) return "";

        int l = 0;
        int r = pairs.size() - 1;
        String result = "";
        while (l <= r) {
            int mid = (l + r) / 2;
            Pair<Integer, String> pair = pairs.get(mid);
            if (pair.getKey() <= timestamp) {
                result = pair.getValue();
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result;
    }

    private class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }
    }
}
