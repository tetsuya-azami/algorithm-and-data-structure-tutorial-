package neetcode.arraysandhashing;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return nums.length != set.size();
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] sCharCounts = new int[26];
        int[] tCharCounts = new int[26];

        char[] sCharArray = s.toCharArray();
        for (char c : sCharArray) {
            sCharCounts[c - 'a'] += 1;
        }

        char[] tCharArray = t.toCharArray();
        for (char c : tCharArray) {
            tCharCounts[c - 'a'] += 1;
        }

        for (int i = 0; i < sCharCounts.length; i++) {
            if (sCharCounts[i] != tCharCounts[i]) return false;
        }

        return true;
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int candidateFirst = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int candidateSecond = nums[j];
                if (candidateFirst + candidateSecond == target) return new int[]{i, j};
            }
        }

        throw new RuntimeException("No pair");
    }

    public int[] twoSumModelAnswer(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int firstNumCandidate = nums[i];
            int secondNumCandidate = target - firstNumCandidate;
            if (map.containsKey(secondNumCandidate)) {
                return new int[]{map.get(secondNumCandidate), i};
            }

            map.put(nums[i], i);
        }

        throw new RuntimeException("No pair");
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs).collect(
                        Collectors.groupingBy(str -> str.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()))
                )
                .values().stream().collect(Collectors.toList());
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String sortedStr = str.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
            if (map.containsKey(sortedStr)) {
                List<String> mapValue = map.get(sortedStr);
                mapValue.add(str);
            } else {
                map.put(sortedStr, new ArrayList<>(List.of(str)));
            }
        }

        return map.values().stream().toList();
    }

    public List<List<String>> groupAnagramsModelAnswer(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(count);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}

