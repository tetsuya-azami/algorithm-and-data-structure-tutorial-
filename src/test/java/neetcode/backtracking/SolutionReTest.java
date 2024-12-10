package neetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionReTest {
    @Test
    void subsets() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.subsets(new int[]{1, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void subsetsIteration() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.subsetsIteration(new int[]{1, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void subsetsBitManipulation() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.subsetsBitManipulation(new int[]{1, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void combinationSum() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.combinationSum(new int[]{2, 5, 6, 9}, 9);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}