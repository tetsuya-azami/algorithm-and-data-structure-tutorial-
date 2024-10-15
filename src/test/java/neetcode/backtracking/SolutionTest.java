package neetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    void subsets() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.subsets(new int[]{1, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void combinationSum() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 5, 6, 9}, 9);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void permute() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.permute(new int[]{1, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void subsetsWithDup() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{1, 2, 1});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void combinationSum2() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.combinationSum2(new int[]{9, 2, 2, 4, 6, 1, 5}, 8);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void exist() {
        Solution solution = new Solution();
        boolean result = solution.exist(
                new char[][]{new char[]{'a', 'b'}},
//                new char[][]{
//                        new char[]{'A', 'B', 'C', 'D'},
//                        new char[]{'S', 'A', 'A', 'T'},
//                        new char[]{'A', 'C', 'A', 'E'}},
                "ba");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void partition() {
        Solution solution = new Solution();
        List<List<String>> result = solution.partition("aab");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void letterCombinations() {
        Solution solution = new Solution();
        List<String> result = solution.letterCombinations("34");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}