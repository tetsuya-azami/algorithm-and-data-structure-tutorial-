package neetcode.mathgeometry;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void isHappy() {
        Solution solution = new Solution();
        boolean result = solution.isHappy(19);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void plusOne() {
        Solution solution = new Solution();
        int[] result = solution.plusOne(new int[]{1, 2, 3, 4});
        System.out.println();
        System.out.println();
        System.out.println();
        for (int e : result) {
            System.out.print(e + ",");
        }
    }
}
