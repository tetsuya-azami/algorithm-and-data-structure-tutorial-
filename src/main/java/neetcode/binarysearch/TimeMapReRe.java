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
        List<Pair<Integer, String>> pairs = map.get(key);
        if (pairs == null || pairs.isEmpty()) return "";

        int l = 0;
        int r = pairs.size() - 1;
        int result = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (pairs.get(mid).key <= timestamp) {
                result = Math.max(result, mid);
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result == -1 ? "" : pairs.get(result).value;
    }

    record Pair<K, V>(K key, V value) {
    }
}
