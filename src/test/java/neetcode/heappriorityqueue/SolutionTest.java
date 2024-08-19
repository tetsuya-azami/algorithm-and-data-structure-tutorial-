package neetcode.heappriorityqueue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void lastStoneWeight() {
        Solution solution = new Solution();
        int result = solution.lastStoneWeight(new int[]{2, 3, 6, 2, 4});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void climbStairs() {
        Solution solution = new Solution();
        int result = solution.climbStairs(5);
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