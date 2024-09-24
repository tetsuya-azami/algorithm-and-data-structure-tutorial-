package neetcode.binarysearch;

import java.util.Arrays;

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] < target) left = middle + 1;
            if (target < nums[middle]) right = middle - 1;
        }

        return -1;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int targetRow = -1;
        int top = 0;
        int last = matrix.length - 1;

        while (top <= last) {
            int middle = (top + last) / 2;
            if (target < matrix[middle][0]) {
                last = middle - 1;
            } else if (matrix[middle][matrix[middle].length - 1] < target) {
                top = middle + 1;
            } else {
                targetRow = middle;
                break;
            }
        }
        if (targetRow == -1) return false;

        int left = 0;
        int right = matrix[targetRow].length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            int middleValue = matrix[targetRow][middle];
            if (target < middleValue) {
                right = middle - 1;
            } else if (middleValue < target) {
                left = middle + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int k = right;
        while (left <= right) {
            int middle = (left + right) / 2;
            int totalTime = 0;
            for (int i = 0; i < piles.length; i++) {
                totalTime += Math.ceil((double) piles[i] / middle);
            }
            if (totalTime <= h) {
                k = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return k;
    }

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] <= nums[r]) {
                return nums[l];
            }
            int middle = (l + r) / 2;
            if (nums[middle] < nums[l]) {
                r = middle;
            } else {
                l = middle + 1;
            }
        }

        return 0;
    }

    public int searchTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) return middle;
            if (nums[left] <= nums[middle]) {
                if (nums[middle] < target || target < nums[left]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } else {
                if (target < nums[middle] || nums[right] < target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }

        return -1;
    }
}