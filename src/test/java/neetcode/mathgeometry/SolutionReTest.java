package neetcode.mathgeometry;

import org.junit.jupiter.api.Test;

class SolutionReTest {
    @Test
    public void isHappy() {
        SolutionRe solutionRe = new SolutionRe();
        boolean result = solutionRe.isHappy(100);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void plusOne() {
        SolutionRe solutionRe = new SolutionRe();
        int[] result = solutionRe.plusOne(new int[]{9, 9, 9});
        System.out.println();
        System.out.println();
        System.out.println();
        for (int e : result) {
            System.out.print(e + ",");
        }
        System.out.println();
    }
}