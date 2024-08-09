package neetcode.binarysearch;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void search() {
        int[] nums = new int[]{-1, 0, 2, 4, 6, 8};
        int target = 4;
        Solution solution = new Solution();
        int result = solution.search(nums, target);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}