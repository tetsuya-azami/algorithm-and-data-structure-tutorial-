package neetcode.heappriorityqueue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class SolutionTest {
    @Test
    public void lastStoneWeight() {
        Solution solution = new Solution();
        int result = solution.lastStoneWeight(new int[]{2, 3, 6, 2, 4});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void climbStairs() {
        Solution solution = new Solution();
        int result = solution.climbStairs(5);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void minCostClimbingStairs() {
        Solution solution = new Solution();
        int result = solution.minCostClimbingStairs(new int[]{1, 2, 1, 2, 1, 1, 1});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void canAttendMeetings() {
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
}