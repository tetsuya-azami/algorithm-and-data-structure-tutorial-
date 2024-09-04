package neetcode.dp;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void climbStairs() {
        Solution solution = new Solution();
        int result = solution.climbStairs(3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void minCostClimbingStairs() {
        Solution solution = new Solution();
        int result = solution.minCostClimbingStairs(new int[]{1, 2, 1, 2, 1, 1, 1});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}