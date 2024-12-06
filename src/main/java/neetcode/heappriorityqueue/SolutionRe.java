package neetcode.heappriorityqueue;


import java.util.Comparator;
import java.util.PriorityQueue;

public class SolutionRe {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair<Integer, int[]>> queue = new PriorityQueue<>(k, Comparator.comparingInt(e -> e.key));
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int distance = point[0] * point[0] + point[1] * point[1];
            queue.offer(new Pair<>(distance, point));
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            Pair<Integer, int[]> pair = queue.poll();
            result[i] = pair.value;
        }

        return result;
    }

    private record Pair<K, V>(K key, V value) {
    }
}
