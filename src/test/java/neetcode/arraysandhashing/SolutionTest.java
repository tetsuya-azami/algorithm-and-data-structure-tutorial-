package neetcode.arraysandhashing;

import org.junit.jupiter.api.Test;

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
}