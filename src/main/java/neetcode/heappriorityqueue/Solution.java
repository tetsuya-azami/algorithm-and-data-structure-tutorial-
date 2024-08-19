package neetcode.heappriorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            Integer biggest = queue.poll();
            Integer secondBiggest = queue.poll();
            int result = biggest - secondBiggest;
            if (result > 0) queue.add(result);
        }

        return queue.isEmpty() ? 0 : queue.poll();
    }

    public int climbStairs(int n) {
        int a = 1;
        int b = 1;

        for (int i = 0; i < n - 1; i++) {
            int tmp = a + b;
            b = a;
            a = tmp;
        }

        return a;
    }

    public int minCostClimbingStairs(int[] cost) {
        for (int i = cost.length - 3; i >= 0; i--) {
            cost[i] += Math.min(cost[i + 1], cost[i + 2]);
        }

        return Math.min(cost[0], cost[1]);
    }
}
