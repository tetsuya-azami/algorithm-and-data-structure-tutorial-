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
}