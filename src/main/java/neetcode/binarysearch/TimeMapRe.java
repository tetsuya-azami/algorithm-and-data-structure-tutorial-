package neetcode.binarysearch;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TimeMapRe {
    private Map<String, List<Pair<Integer, String>>> map;

    public TimeMapRe() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new LinkedList<>()).add(new Pair<>(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> targetList = map.get(key);
        if (targetList == null || targetList.isEmpty()) return "";

        int left = 0;
        int right = targetList.size() - 1;
        String result = "";
        while (left <= right) {
            int middle = (left + right) / 2;
            if (targetList.get(middle).timestamp <= timestamp) {
                result = targetList.get(middle).value;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return result;
    }

    private record Pair<K, V>(K timestamp, V value) {
    }
}
