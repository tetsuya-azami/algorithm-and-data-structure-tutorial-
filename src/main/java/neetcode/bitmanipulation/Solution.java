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
}
