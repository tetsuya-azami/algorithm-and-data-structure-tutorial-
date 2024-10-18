package neetcode.graphs;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numIslands() {
        Solution solution = new Solution();
        int result = solution.numIslands(
                new char[][]{
                        new char[]{'0', '1', '1', '1', '0'},
                        new char[]{'0', '1', '0', '1', '0'},
                        new char[]{'1', '1', '0', '0', '0'},
                        new char[]{'0', '0', '0', '0', '0'}}
        );
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}