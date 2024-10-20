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

    @Test
    void maxAreaOfIsland() {
        Solution solution = new Solution();
        int result = solution.maxAreaOfIsland(new int[][]{
                new int[]{0, 1, 1, 0, 1},
                new int[]{1, 0, 1, 0, 1},
                new int[]{0, 1, 1, 0, 1},
                new int[]{0, 1, 0, 0, 1}
        });
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void cloneGraph() {
        Solution solution = new Solution();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);

        Node result = solution.cloneGraph(node1);
        System.out.println(node1);
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}