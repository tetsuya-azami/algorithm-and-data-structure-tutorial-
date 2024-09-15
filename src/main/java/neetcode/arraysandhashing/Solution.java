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

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        LinkedHashMap<Integer, Integer> linkedHashMap =
                map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k1, k2) -> k1, LinkedHashMap::new));

        int[] results = new int[k];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : linkedHashMap.entrySet()) {
            if (i == k) break;
            results[i] = entry.getKey();
            i++;
        }

        return results;
    }

    public int[] topKFrequent2(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] results = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i > 0 && index < k; i--) {
            for (int num : bucket[i]) {
                if (index == k) break;
                results[index++] = num;
            }
        }

        return results;
    }

    public String encode(List<String> strs) {
        StringBuilder stb = new StringBuilder();
        for (String str : strs) {
            stb.append(str.length()).append("#").append(str);
        }
        return stb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;
            int strLength = Integer.parseInt(str.substring(i, j));
            i = j + 1; // #は飛ばす

            result.add(str.substring(i, i + strLength));
            i = i + strLength;
        }

        return result;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            results[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            right *= nums[i];
            results[i - 1] *= right;
        }

        return results;
    }

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> column = new HashMap<>();
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<Integer, Set<Character>> square = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char cell = board[r][c];
                if (cell == '.') continue;
                // duplicate check
                if (column.getOrDefault(c, new HashSet<>()).contains(cell) ||
                        row.getOrDefault(r, new HashSet<>()).contains(cell) ||
                        square.getOrDefault((r / 3) * 3 + (c / 3), new HashSet<>()).contains(cell)) return false;

                // update map
                column.computeIfAbsent(c, k -> new HashSet<>()).add(cell);
                row.computeIfAbsent(r, k -> new HashSet<>()).add(cell);
                square.computeIfAbsent((r / 3) * 3 + (c / 3), k -> new HashSet<>()).add(cell);
            }
        }

        return true;
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int result = 0;
        for (Integer e : set) {
            if (!set.contains(e - 1)) {
                int length = 1;
                while (set.contains(e + 1)) {
                    length++;
                    e++;
                }
                result = Math.max(result, length);
            }
        }

        return result;
    }

    public int[] twoSum2(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int current = numbers[left] + numbers[right];
            if (current > target) {
                right--;
            } else if (current < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }

        return new int[0];
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                }
            }
        }

        return result;
    }

    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(heights[left], heights[right]));
            if (heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap = new LinkedHashMap<>();
        int maxLength = 0;
        int nowLength = 0;
        int removalIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charIndexMap.containsKey(c)) {
                Integer duplicatedCharIndex = charIndexMap.get(c);
                for (int j = removalIndex; j <= duplicatedCharIndex; j++) {
                    charIndexMap.remove(s.charAt(j));
                    removalIndex = j + 1;
                    nowLength--;
                }
                charIndexMap.put(c, i);
                nowLength++;
            } else {
                charIndexMap.put(c, i);
                nowLength++;
            }
            maxLength = Math.max(maxLength, nowLength);
        }

        return maxLength;
    }

    public int lengthOfLongestSubstring2(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength = Math.max(maxLength, set.size());
        }

        return maxLength;
    }
}
