package neetcode.arraysandhashing;

import java.util.*;

public class SolutionReRe {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] characterCountMap = new int[26];
            for (char c : str.toCharArray()) {
                characterCountMap[c - 'a']++;
            }
            String key = Arrays.toString(characterCountMap);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return map.values().stream().toList();
    }

    public List<List<String>> groupAnagramsRe(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] keyArray = new int[26];
            for (char c : str.toCharArray()) {
                keyArray[c - 'a']++;
            }
            String key = Arrays.toString(keyArray);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
