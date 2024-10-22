package neetcode.arraysandhashing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionTest {
    @Test
    void containsDuplicate() {
        int[] nums = {1, 2, 3, 3};
        Solution solution = new Solution();
        boolean result = solution.hasDuplicate(nums);
        System.out.println(result);
    }

    @Test
    void isAnagram() {
        String s = "jar";
        String t = "jam";
        Solution solution = new Solution();
        boolean result = solution.isAnagram(s, t);
        System.out.println(result);
    }

    @Test
    void twoSum() {
        int[] nums = new int[]{3, 4, 5, 6};
        int target = 7;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        for (int e : result) {
            System.out.println(e);
        }
    }

    @Test
    void twoSumModelAnswer() {
        int[] nums = new int[]{3, 4, 5, 6};
        int target = 7;

        Solution solution = new Solution();
        int[] result = solution.twoSumModelAnswer(nums, target);
        for (int e : result) {
            System.out.println(e);
        }
    }

    @Test
    void groupAnagrams() {
        Solution solution = new Solution();
        List<List<String>> results = solution.groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(results);
    }

    @Test
    void groupAnagrams2() {
        Solution solution = new Solution();
        List<List<String>> results = solution.groupAnagrams2(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(results);
    }

    @Test
    void groupAnagramsModelAnswer() {
        Solution solution = new Solution();
        List<List<String>> results = solution.groupAnagramsModelAnswer(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(results);
    }

    @Test
    void topKFrequent() {
        Solution solution = new Solution();
        int[] result = solution.topKFrequent(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void topKFrequent2() {
        Solution solution = new Solution();
        int[] result = solution.topKFrequent2(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void encodeAndDecode() {
        Solution solution = new Solution();
        String encoded = solution.encode(new ArrayList<>(Arrays.asList("neet", "code", "love", "you", "5#")));
        List<String> decode = solution.decode(encoded);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(encoded);
        System.out.println();
        System.out.println(decode);
    }

    @Test
    void productExceptSelf() {
        Solution solution = new Solution();
        int[] results = solution.productExceptSelf(new int[]{1, 2, 4, 6});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(results));
    }

    @Test
    void isValidSudoku() {
        Solution solution = new Solution();
        boolean result = solution.isValidSudoku(new char[][]{
                new char[]{'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                new char[]{'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                new char[]{'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                new char[]{'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                new char[]{'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                new char[]{'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        });
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void longestConsecutive() {
        Solution solution = new Solution();
        int result = solution.longestConsecutive(new int[]{2, 20, 4, 10, 3, 4, 5});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void twoSum2() {
        Solution solution = new Solution();
        int[] result = solution.twoSum2(new int[]{1, 2, 3, 4}, 3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void threeSum() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void maxArea() {
        Solution solution = new Solution();
        int result = solution.maxArea(new int[]{1, 7, 2, 5, 4, 7, 3, 6});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void lengthOfLongestSubstring() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcdefghijk");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void lengthOfLongestSubstring2() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring2("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcdefghijk");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void characterReplacement() {
        Solution solution = new Solution();
        int result = solution.characterReplacement("XYYX", 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void groupAnagramsRe() {
        Solution solution = new Solution();
        List<List<String>> results = solution.groupAnagramsRe(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(results);
    }

    @Test
    void topKFrequentRe() {
        Solution solution = new Solution();
        int[] result = solution.topKFrequentRe(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void topKFrequentReHeap() {
        Solution solution = new Solution();
        int[] result = solution.topKFrequentReHeap(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }
}