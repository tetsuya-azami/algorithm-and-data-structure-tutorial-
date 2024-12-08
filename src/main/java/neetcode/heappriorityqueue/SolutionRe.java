package neetcode.heappriorityqueue;


import java.util.*;

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

    public int[][] kClosestSort(int[][] points, int k) {
        int[][] sortedPoints = Arrays.stream(points).sorted(Comparator.comparingInt(e -> (e[0] * e[0] + e[1] * e[1]))).toArray(int[][]::new);
        return Arrays.copyOfRange(sortedPoints, 0, k);
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.peek();
    }

    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            counts[tasks[i] - 'A']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((e1, e2) -> e2 - e1);
        for (int count : counts) {
            if (count > 0) maxHeap.add(count);
        }

        Deque<Pair<Integer, Integer>> queue = new ArrayDeque<>();
        int time = 0;
        while (!maxHeap.isEmpty() || !queue.isEmpty()) {
            time++;
            if (maxHeap.isEmpty()) {
                time = queue.peek().key;
            } else {
                int count = maxHeap.poll() - 1;
                if (count > 0) {
                    queue.add(new Pair<>(time + n, count));
                }
            }

            if (!queue.isEmpty() && queue.peek().key == time) {
                maxHeap.add(queue.poll().value);
            }
        }

        return time;
    }
}