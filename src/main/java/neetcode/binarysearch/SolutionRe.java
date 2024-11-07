package neetcode.binarysearch;

import java.util.Arrays;

public class SolutionRe {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().orElseThrow();
        int left = 1;
        int right = max;
        while (left < right) {
            int eatPerHour = (left + right) / 2;
            int takeTime = 0;
            for (int i = 0; i < piles.length; i++) {
                takeTime += (int) Math.ceil((double) piles[i] / eatPerHour);
            }

            if (takeTime <= h) {
                right = eatPerHour;
            } else {
                left = eatPerHour + 1;
            }
        }

        return right;
    }

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] < nums[right]) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return nums[right];
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] <= nums[right]) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        int minIndex = right;
        int maxIndex = minIndex == 0 ? nums.length - 1 : minIndex - 1;

        if (target == nums[minIndex]) {
            return minIndex;
        } else if (nums[0] <= target && target <= nums[maxIndex]) {
            left = 0;
            right = maxIndex;
        } else if (nums[minIndex] < target && target <= nums[nums.length - 1]) {
            left = minIndex;
            right = nums.length - 1;
        } else {
            return -1;
        }

        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
