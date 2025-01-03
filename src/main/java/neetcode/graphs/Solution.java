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

    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        Set<Pair<Integer, Integer>> isVisited = new HashSet<>();
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                result = Math.max(result, maxAreaOfIslandDfs(grid, row, col, isVisited));
            }
        }

        return result;
    }

    private int maxAreaOfIslandDfs(int[][] grid, int row, int col, Set<Pair<Integer, Integer>> isVisited) {
        int rowMax = grid.length - 1;
        int colMax = grid[0].length - 1;
        Pair<Integer, Integer> pair = new Pair<>(row, col);
        if (!isInRange(pair, rowMax, colMax) || grid[row][col] != 1 || isVisited.contains(pair)) return 0;

        isVisited.add(pair);
        int below = maxAreaOfIslandDfs(grid, row + 1, col, isVisited);
        int above = maxAreaOfIslandDfs(grid, row - 1, col, isVisited);
        int right = maxAreaOfIslandDfs(grid, row, col + 1, isVisited);
        int left = maxAreaOfIslandDfs(grid, row, col - 1, isVisited);

        return below + above + right + left + 1;
    }

    public Node cloneGraph(Node node) {
        Map<Node, Node> oldToNew = new HashMap<>();
        return cloneGraphDfs(node, oldToNew);
    }

    private Node cloneGraphDfs(Node old, Map<Node, Node> oldToNews) {
        if (old == null) return null;
        if (oldToNews.containsKey(old)) return oldToNews.get(old);
        Node copy = new Node(old.val);
        oldToNews.put(old, copy);
        old.neighbors.forEach(neighbor -> copy.neighbors.add(cloneGraphDfs(neighbor, oldToNews)));

        return copy;
    }

    public Node cloneGraphRe(Node node) {
        Map<Node, Node> oldToNew = new HashMap<>();
        return cloneGraphReDfs(node, oldToNew);
    }

    private Node cloneGraphReDfs(Node oldNode, Map<Node, Node> oldToNew) {
        if (oldNode == null) return null;
        if (oldToNew.containsKey(oldNode)) return oldToNew.get(oldNode);

        Node newNode = new Node(oldNode.val);
        oldToNew.put(oldNode, newNode);

        oldNode.neighbors.forEach(neighbor -> newNode.neighbors.add(cloneGraphReDfs(neighbor, oldToNew)));

        return newNode;
    }
}