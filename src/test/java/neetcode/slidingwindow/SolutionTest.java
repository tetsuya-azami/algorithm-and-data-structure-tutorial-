package neetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    public void maxProfit() {
        int[] ints = new int[]{10, 1, 5, 6, 7, 1};
        Solution solution = new Solution();
        int result = solution.maxProfit(ints);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
        assertEquals(6, result);
    }
}