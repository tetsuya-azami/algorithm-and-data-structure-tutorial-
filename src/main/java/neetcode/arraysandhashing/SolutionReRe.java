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

    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        suffix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }

    public int[] topKFrequentSortN(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    public int[] topKFrequentHeap(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.stream().mapToInt(Map.Entry::getKey).toArray();
    }

    public int[] topKFrequentBucketSort(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (Integer e : bucket[i]) {
                    if (index == k) return result;
                    result[index++] = e;
                }
            }
        }

        return result;
    }

    public String encodeRe(List<String> strs) {
        StringBuilder stb = new StringBuilder();
        for (String str : strs) {
            stb.append(str.length()).append('#').append(str);
        }

        return stb.toString();
    }


    public List<String> decodeRe(String str) {
        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < str.length()) {
            int numberOfChar = 0;
            while (str.charAt(index) != '#') {
                numberOfChar = numberOfChar * 10 + Integer.parseInt(String.valueOf(str.charAt(index)));
                index++;
            }
            index++;
            result.add(str.substring(index, index + numberOfChar));
            index += numberOfChar;
        }

        return result;
    }

    public List<List<String>> groupAnagramsReReRe(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] charCounts = new int[26];
            for (char c : str.toCharArray()) {
                charCounts[c - 'a']++;
            }
            String charCountsStr = Arrays.toString(charCounts);
            map.computeIfAbsent(charCountsStr, e -> new ArrayList<>()).add(str);
        }

        return map.values().stream().toList();
    }

    public int longestConsecutiveRe(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int value = min;
        int result = 0;
        int nowSequenceLength = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        while (value <= max) {
            if (set.contains(value)) {
                nowSequenceLength++;
                result = Math.max(result, nowSequenceLength);
            } else {
                nowSequenceLength = 0;
            }
            value++;
        }

        return result;
    }

    public int[] productExceptSelfRe(int[] nums) {
        int[] preProducts = new int[nums.length];
        int[] sufProducts = new int[nums.length];
        int[] result = new int[nums.length];
        preProducts[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            preProducts[i] = preProducts[i - 1] * nums[i - 1];
        }
        sufProducts[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            sufProducts[i] = sufProducts[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = preProducts[i] * sufProducts[i];
        }

        return result;
    }

    public int[] topKFrequentRe(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            maxHeap.offer(entry);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.stream().mapToInt(Map.Entry::getKey).toArray();
    }

    public int[] topKFrequentBucket(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < nums.length + 1; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] results = new int[k];
        int index = 0;
        for (int i = nums.length; i >= 0; i--) {
            for (Integer value : bucket[i]) {
                if (index == k) return results;
                results[index++] = value;
            }
        }

        return results;
    }
}