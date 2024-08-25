package neetcode.arraysandhashing;

import org.junit.jupiter.api.Test;

public class SolutionReTest {
    @Test
    public void twoSum() {
        SolutionRe solutionRe = new SolutionRe();
        int[] result = solutionRe.twoSum(new int[]{1, 3, 4, 2}, 6);
        System.out.println();
        System.out.println();
        System.out.println();
        for (int e : result) {
            System.out.println(e + ",");
        }
    }
}
