package neetcode.binarysearch;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void search() {
        int[] nums = new int[]{-1, 0, 2, 4, 6, 8};
        int target = 4;
        Solution solution = new Solution();
        int result = solution.search(nums, target);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void searchMatrix() {
        Solution solution = new Solution();
        boolean result = solution.searchMatrix(
                new int[][]{
                        new int[]{1, 2, 4, 8},
                        new int[]{10, 11, 12, 13},
                        new int[]{14, 20, 30, 40}
                }, 10);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void minEatingSpeed() {
        Solution solution = new Solution();
        int result = solution.minEatingSpeed(new int[]{25, 10, 23, 4}, 4);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result); // 25
    }

    @Test
    public void findMin() {
        Solution solution = new Solution();
        int result = solution.findMin(new int[]{4, 5, 0, 1, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void searchTarget() {
        Solution solution = new Solution();
        int result = solution.searchTarget(new int[]{3, 4, 5, 6, 1, 2}, 1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}