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
}
