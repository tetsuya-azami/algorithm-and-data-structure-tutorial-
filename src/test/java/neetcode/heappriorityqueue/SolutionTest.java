package neetcode.heappriorityqueue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class SolutionTest {
    @Test
    void lastStoneWeight() {
        Solution solution = new Solution();
        int result = solution.lastStoneWeight(new int[]{2, 3, 6, 2, 4});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void climbStairs() {
        Solution solution = new Solution();
        int result = solution.climbStairs(5);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void minCostClimbingStairs() {
        Solution solution = new Solution();
        int result = solution.minCostClimbingStairs(new int[]{1, 2, 1, 2, 1, 1, 1});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void canAttendMeetings() {
        Solution solution = new Solution();
        ArrayList<Interval> intervals = new ArrayList<>(Arrays.asList(
                new Interval(0, 8), new Interval(8, 16), new Interval(20, 30)
        ));
        boolean result = solution.canAttendMeetings(intervals);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void canAttendMeetingsModelAnswer() {
        Solution solution = new Solution();
        ArrayList<Interval> intervals = new ArrayList<>(Arrays.asList(
                new Interval(0, 8), new Interval(8, 16), new Interval(20, 30)
        ));
        boolean result = solution.canAttendMeetingsModelAnswer(intervals);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void findKthLargest() {
        Solution solution = new Solution();
        int result = solution.findKthLargest(new int[]{2, 3, 1, 5, 4}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void findKthLargestModelAnswer() {
        Solution solution = new Solution();
        int result = solution.findKthLargestModelAnswer(new int[]{2, 3, 1, 1, 5, 5, 4}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}