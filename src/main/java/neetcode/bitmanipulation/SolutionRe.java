package neetcode.bitmanipulation;

public class SolutionRe {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            long pow = (long) Math.pow(2, i);
            if ((pow & n) == pow) {
                count++;
            }
        }

        return count;
    }
}
