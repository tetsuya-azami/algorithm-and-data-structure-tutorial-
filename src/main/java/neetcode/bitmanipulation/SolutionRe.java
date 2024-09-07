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
        int pow = 1;
        for (int i = 0; i < 32; i++) {
            if ((pow & n) == pow) {
                count++;
            }
            pow *= 2;
        }

        return count;
    }

    public int hammingWeight2(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) count++;
            n >>= 1;
        }

        return count;
    }
}
