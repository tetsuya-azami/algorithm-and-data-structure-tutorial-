package neetcode.heappriorityqueue;

import java.util.PriorityQueue;

class KthLargestRe {
    private final int k;
    private final PriorityQueue<Integer> prioritizedNums;

    public KthLargestRe(int k, int[] nums) {
        this.k = k;
        this.prioritizedNums = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        prioritizedNums.offer(val);
        if (prioritizedNums.size() > k) {
            prioritizedNums.poll();
        }
        return prioritizedNums.peek();
    }
}