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
}
