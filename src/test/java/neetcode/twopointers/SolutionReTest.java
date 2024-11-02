package neetcode.twopointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionReTest {
    @Test
    void twoSumBruteForce() {
        SolutionRe solutionRe = new SolutionRe();
        int[] result = solutionRe.twoSumBruteForce(new int[]{1, 2, 3, 4}, 3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void twoSumTwoPointers() {
        SolutionRe solutionRe = new SolutionRe();
        int[] result = solutionRe.twoSumTwoPointers(new int[]{1, 2, 3, 4}, 3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }
}