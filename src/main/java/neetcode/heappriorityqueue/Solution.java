package neetcode.heappriorityqueue;

import java.util.*;

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

    public boolean canAttendMeetings(List<Interval> intervals) {
        int maxEnd = 0;
        for (Interval interval : intervals) {
            maxEnd = Math.max(maxEnd, interval.end);
        }
        boolean[] isAttended = new boolean[maxEnd];
        Arrays.fill(isAttended, false);

        for (int i = 0; i < intervals.size(); i++) {
            for (int j = intervals.get(i).start; j < intervals.get(i).end; j++) {
                if (isAttended[j]) return false;
                isAttended[j] = true;
            }
        }
        return true;
    }

    public boolean canAttendMeetingsModelAnswer(List<Interval> intervals) {
        List<Interval> sortedIntervals = intervals.stream().sorted(Comparator.comparingInt(e -> e.start)).toList();
        for (int i = 1; i < sortedIntervals.size(); i++) {
            int e1End = sortedIntervals.get(i - 1).end;
            int e2Start = sortedIntervals.get(i).start;
            if (e2Start < e1End) return false;
        }
        return true;
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else {
                int smallest = minHeap.poll();
                minHeap.offer(Math.max(smallest, num));
            }
        }
        return minHeap.peek();
    }

    public int findKthLargestModelAnswer(int[] nums, int k) {
        k = nums.length - k;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int pivotIndex = partition(nums, left, right);
            if (pivotIndex < k) {
                left = pivotIndex + 1;
            } else if (k < pivotIndex) {
                right = pivotIndex - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right], fill = left;
        for (int i = left; i < right; i++) {
            if (nums[i] <= pivot) {
                int tmp = nums[fill];
                nums[fill++] = nums[i];
                nums[i] = tmp;
            }
        }
        nums[right] = nums[fill];
        nums[fill] = pivot;

        return fill;
    }
}
