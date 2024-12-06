package neetcode.heappriorityqueue;


import java.util.PriorityQueue;

public class SolutionRe {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair<Integer, int[]>> queue = new PriorityQueue<>(k, (e1, e2) -> e2.key - e1.key);
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int distance = point[0] * point[0] + point[1] * point[1];
            queue.offer(new Pair<>(distance, point));
            if (queue.size() > k) {
                queue.poll();
            }
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
