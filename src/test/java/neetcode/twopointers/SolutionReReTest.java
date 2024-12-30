package neetcode.twopointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionReReTest {
    @Test
    void twoSum() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int[] result = solutionReRe.twoSum(new int[]{1, 2, 3, 4}, 3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void threeSum() {
        SolutionReRe solutionRe = new SolutionReRe();
        List<List<Integer>> result = solutionRe.threeSum(new int[]{-2, 0, 1, 1, 2});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void threeSumRe() {
        SolutionReRe solutionRe = new SolutionReRe();
        List<List<Integer>> result = solutionRe.threeSumRe(new int[]{0, 0, 0});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void threeSumReRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        List<List<Integer>> result = solutionReRe.threeSumReRe(new int[]{-2, 0, 1, 1, 2});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}