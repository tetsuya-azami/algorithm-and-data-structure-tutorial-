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

    @Test
    void combinationSumOptimal() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.combinationSumOptimal(new int[]{2, 5, 6, 9}, 9);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void permute() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.permute(new int[]{1, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void permuteRecursion() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.permuteRecursion(new int[]{1, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void permuteIteration() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.permuteIteration(new int[]{1, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void permuteBackTrackOptimal() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.permuteBackTrackOptimal(new int[]{1, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void subsetsWithDupBruteForce() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.subsetsWithDupBruteForce(new int[]{1, 2, 1});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void subsetsWithDupPickAndNotPick() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.subsetsWithDupPickAndNotPick(new int[]{1, 2, 1});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void combinationSum2() {
        SolutionRe solutionRe = new SolutionRe();
        List<List<Integer>> result = solutionRe.combinationSum2(new int[]{1, 2, 3, 4, 5}, 7);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}