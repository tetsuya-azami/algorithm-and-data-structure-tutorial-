package neetcode.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMapReRe {

    private Map<String, List<Pair<Integer, String>>> map;

    public TimeMapReRe() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>())
                .add(new Pair<>(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> pairs = map.getOrDefault(key, new ArrayList<>());

        int l = 0;
        int r = pairs.size() - 1;
        String result = "";
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (pairs.get(mid).key <= timestamp) {
                result = pairs.get(mid).value;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result;
    }

    record Pair<K, V>(K key, V value) {
    }
}
