package neetcode.dp;

public class Solution {

    public int climbStairs(int n) {
        int[] array = new int[n + 1];
        array[n] = 1;
        array[n - 1] = 1;
        while (n - 2 >= 0) {
            array[n - 2] = array[n] + array[n - 1];
            n--;
        }

        return array[0];
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i], dp[i - 1] + cost[i]);
        }

        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}
