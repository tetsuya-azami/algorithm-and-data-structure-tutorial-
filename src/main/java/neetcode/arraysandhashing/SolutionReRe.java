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

    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, true);
        }

        int result = 0;
        int tmp = 0;
        for (int num : nums) {
            if (map.get(num)) {
                tmp++;
                int plus = num + 1;
                while (map.containsKey(plus)) {
                    tmp++;
                    plus = plus + 1;
                }
                int minus = num - 1;
                while (map.containsKey(minus)) {
                    tmp++;
                    minus = minus - 1;
                }
                result = Math.max(result, tmp);
            } else {
                continue;
            }
            tmp = 0;
        }

        return result;
    }

    public int longestConsecutiveSorting(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int tmp = 0;
        int pre = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pre) {
                continue;
            }
            if (nums[i] != pre + 1) {
                tmp = 0;
            }
            tmp++;
            result = Math.max(result, tmp);
            pre = nums[i];
        }

        return result;
    }

    public int longestConsecutiveHashSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int result = 0;
        int tmp = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                tmp++;
                while (set.contains(num + 1)) {
                    tmp++;
                    num = num + 1;
                }
                result = Math.max(result, tmp);
            }
            tmp = 0;
        }

        return result;
    }
}
