package neetcode.arraysandhashing;

import java.util.*;

public class SolutionRe {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(num, i);
        }

        throw new RuntimeException();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] counts = new int[26];
            for (char c : str.toCharArray()) {
                counts[c - 'a'] += 1;
            }
            String key = Arrays.toString(counts);

            map.computeIfAbsent(key, (k) -> new ArrayList<>()).add(str);
        }

        return map.values().stream().toList();
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<int[]> list = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new int[]{entry.getKey(), entry.getValue()});
        }
        list.sort((e1, e2) -> e2[1] - e1[1]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i)[0];
        }

        return result;
    }

    public int[] topKFrequentHeap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair<Integer, Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(e -> e.count));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer num = entry.getKey();
            Integer count = entry.getValue();
            queue.offer(new Pair<>(num, count));
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            Pair<Integer, Integer> pair = queue.poll();
            if (pair == null) throw new RuntimeException("要素がk個より少ないです。");
            result[i] = pair.num;
        }

        return result;
    }

    private record Pair<K, V>(K num, V count) {
    }

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        char delimiter = '#';
        for (String str : strs) {
            int length = str.length();
            sb.append(length).append(delimiter).append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new LinkedList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;
            String length = str.substring(i, j);
            int nextIndex = j + 1 + Integer.parseInt(length);
            String substring = str.substring(j + 1, nextIndex);
            result.add(substring);
            i = nextIndex;
        }

        return result;
    }

    public int[] productExceptSelfUsingPrefixSuffix(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

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

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
}
