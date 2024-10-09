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
}