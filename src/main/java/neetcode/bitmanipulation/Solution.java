package neetcode.bitmanipulation;

public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        return res;
    }

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) count++;
            n = n >> 1;
        }
        return count;
    }

    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int target = i;
            while (target != 0) {
                if ((target & 1) == 1) count++;
                target = target >> 1;
            }
            result[i] = count;
        }

        return result;
    }

    public int[] countBitsModelAnswer(int n) {
        int offset = 1;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i == offset * 2) {
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }

        return dp;
    }

    public int reverseBits(int n) {
        int[] reversed = new int[32];
        for (int i = 0; i < 32; i++) {
            reversed[i] = n & 1;
            n = n >>> 1;
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += reversed[i] << (31 - i);
        }

        return result;
    }

    public int reverseBitsModelAnswer(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bit = n & 1;
            n >>= 1;
            result += bit << (31 - i);
        }

        return result;
    }

    public int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result += i - nums[i];
        }
        return result;
    }
}
