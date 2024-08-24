package neetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void singleNumber() {
        Solution solution = new Solution();
        int result = solution.singleNumber(new int[]{3, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void hammingWeight() {
        Solution solution = new Solution();
        int result = solution.hammingWeight(23);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void countBits() {
        Solution solution = new Solution();
        int[] result = solution.countBits(4);
        System.out.println();
        System.out.println();
        System.out.println();
        for (int e : result) {
            System.out.print(e + ",");
        }
    }

    @Test
    public void countBitsModelAnswer() {
        Solution solution = new Solution();
        int[] result = solution.countBitsModelAnswer(4);
        System.out.println();
        System.out.println();
        System.out.println();
        for (int e : result) {
            System.out.print(e + ",");
        }
    }

    @Test
    public void reverseBits() {
        Solution solution = new Solution();
        int result = solution.reverseBits(21);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}
