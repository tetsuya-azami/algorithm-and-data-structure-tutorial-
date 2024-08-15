package neetcode.heappriorityqueue;

import java.util.PriorityQueue;

class KthLargest {

    private int k;
    private PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
            if (k < queue.size()) {
                queue.poll();
            }
        }
    }

    public int add(int val) {
        queue.offer(val);
        if (k < queue.size()) {
            queue.poll();
        }

        return queue.peek();
    }
}
