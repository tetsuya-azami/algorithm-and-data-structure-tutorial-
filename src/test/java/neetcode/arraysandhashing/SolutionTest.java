package neetcode.arraysandhashing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionTest {
    @Test
    public void containsDuplicate() {
        int[] nums = {1, 2, 3, 3};
        Solution solution = new Solution();
        boolean result = solution.hasDuplicate(nums);
        System.out.println(result);
    }

    @Test
    public void isAnagram() {
        String s = "jar";
        String t = "jam";
        Solution solution = new Solution();
        boolean result = solution.isAnagram(s, t);
        System.out.println(result);
    }

    @Test
    public void twoSum() {
        int[] nums = new int[]{3, 4, 5, 6};
        int target = 7;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        for (int e : result) {
            System.out.println(e);
        }
    }

    @Test
    public void twoSumModelAnswer() {
        int[] nums = new int[]{3, 4, 5, 6};
        int target = 7;

        Solution solution = new Solution();
        int[] result = solution.twoSumModelAnswer(nums, target);
        for (int e : result) {
            System.out.println(e);
        }
    }

    @Test
    public void groupAnagrams() {
        Solution solution = new Solution();
        List<List<String>> results = solution.groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(results);
    }

    @Test
    public void groupAnagrams2() {
        Solution solution = new Solution();
        List<List<String>> results = solution.groupAnagrams2(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(results);
    }

    @Test
    public void groupAnagramsModelAnswer() {
        Solution solution = new Solution();
        List<List<String>> results = solution.groupAnagramsModelAnswer(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(results);
    }

    @Test
    public void topKFrequent() {
        Solution solution = new Solution();
        int[] result = solution.topKFrequent(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }
}