package neetcode.binarysearch;

public class SolutionReRe {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int l = 1;
        int r = max;
        int k = max;
        while (l <= r) {
            int time = 0;
            int mid = (l + r) / 2;
            for (int pile : piles) {
                time += (int) Math.ceil((double) pile / mid);
            }
            if (time <= h) {
                k = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return k;
    }

    public int findMin(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) return nums[0];
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l] < nums[r]) {
                break;
            }

            int mid = l + (r - l) / 2;
            if (nums[l] <= nums[mid]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return nums[l];
    }

    public int findMinRe(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) return nums[0];
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return nums[l];
    }

    public int minEatingSpeedRe(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int l = 1;
        int r = max;
        int k = max;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            double time = 0;
            for (int i = 0; i < piles.length; i++) {
                time += Math.ceil((double) piles[i] / mid);
            }
            if (time <= h) {
                k = Math.min(k, mid);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return k;
    }

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target == nums[mid]) return mid;
            if (nums[l] <= nums[mid]) {
                if (target < nums[l] || target > nums[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else { // midがright portion
                if (target < nums[mid] || target > nums[r]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        
        return -1;
    }
}
