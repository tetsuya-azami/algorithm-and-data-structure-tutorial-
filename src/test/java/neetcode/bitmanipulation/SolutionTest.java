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
}
