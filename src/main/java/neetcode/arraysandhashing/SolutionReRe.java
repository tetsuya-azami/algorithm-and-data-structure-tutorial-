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

    public String encode(List<String> strs) {
        StringBuilder stb = new StringBuilder();
        for (String str : strs) {
            stb.append(str.length()).append('#').append(str);
        }
        return stb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int length = 0;
            while (str.charAt(i) != '#') {
                length = length * 10 + Integer.parseInt(String.valueOf(str.charAt(i)));
                i++;
            }
            i++;
            String substring = str.substring(i, i + length);
            result.add(substring);
            i = i + length;
        }

        return result;
    }
}
