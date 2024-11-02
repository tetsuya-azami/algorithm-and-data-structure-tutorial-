package neetcode.twopointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    void threeSumHashMap() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.threeSumHashMap(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}