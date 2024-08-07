package neetcode.containsdupulicate;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void containsDuplicate() {
        int[] nums = {1, 2, 3, 3};
        Solution solution = new Solution();
        boolean result = solution.hasDuplicate(nums);
        System.out.println(result);
    }
}