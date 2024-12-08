package neetcode.heappriorityqueue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionReTest {
    @Test
    void kClosest() {
        SolutionRe solutionRe = new SolutionRe();
        int[][] results = solutionRe.kClosest(new int[][]{new int[]{0, 2}, new int[]{2, 2}}, 1);
        System.out.println();
        System.out.println();
        System.out.println();
        for (int[] result : results) {
            System.out.print(Arrays.toString(result));
        }
    }

    @Test
    void kClosestSort() {
        SolutionRe solutionRe = new SolutionRe();
        int[][] results = solutionRe.kClosestSort(new int[][]{new int[]{0, 2}, new int[]{2, 2}}, 1);
        System.out.println();
        System.out.println();
        System.out.println();
        for (int[] result : results) {
            System.out.print(Arrays.toString(result));
        }
    }

    @Test
    void findKthLargest() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.findKthLargest(new int[]{2, 3, 1, 5, 4}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}