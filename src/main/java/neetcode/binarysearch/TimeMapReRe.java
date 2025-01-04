package neetcode.binarysearch;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMapReRe {

    private Map<String, TreeMap<Integer, String>> map;

    public TimeMapReRe() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            TreeMap<Integer, String> treeMap = map.get(key);
            treeMap.put(timestamp, value);
        } else {
            TreeMap<Integer, String> treeMap = new TreeMap<>((e1, e2) -> e2 - e1);
            treeMap.put(timestamp, value);
            map.put(key, treeMap);
        }
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> treeMap = map.get(key);
        if (treeMap == null) return "";
        
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            if (entry.getKey() <= timestamp) {
                return entry.getValue();
            }
        }

        return "";
    }
}
