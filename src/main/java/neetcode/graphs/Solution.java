package neetcode.graphs;

import java.util.*;

public class Solution {
    public int numIslands(char[][] grid) {
        Set<Pair<Integer, Integer>> visited = new HashSet<>();
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1' && !visited.contains(new Pair<>(row, col))) {
                    count++;
                    numIslandsBfs(grid, row, col, visited);
                }
            }
        }

        return count;
    }

    private void numIslandsBfs(char[][] grid, int row, int col, Set<Pair<Integer, Integer>> visited) {
        Deque<Pair<Integer, Integer>> que = new ArrayDeque<>();
        que.add(new Pair<>(row, col));
        int rowMax = grid.length - 1;
        int colMax = grid[0].length - 1;

        while (!que.isEmpty()) {
            Pair<Integer, Integer> pair = que.poll();
            List<Pair<Integer, Integer>> candidates =
                    List.of(
                            new Pair<>(pair.key + 1, pair.value),
                            new Pair<>(pair.key - 1, pair.value),
                            new Pair<>(pair.key, pair.value + 1),
                            new Pair<>(pair.key, pair.value - 1)
                    );
            for (Pair<Integer, Integer> candidate : candidates) {
                if (isInRange(candidate, rowMax, colMax) && !visited.contains(candidate) && grid[candidate.key][candidate.value] == '1') {
                    visited.add(candidate);
                    que.add(candidate);
                }
            }
        }
    }

    private boolean isInRange(Pair<Integer, Integer> pair, int rowMax, int colMax) {
        return 0 <= pair.key && pair.key <= rowMax && 0 <= pair.value && pair.value <= colMax;
    }

    private record Pair<K, V>(K key, V value) {
    }
}
