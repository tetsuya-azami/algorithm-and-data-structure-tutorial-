package neetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionReRe {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] result = new int[2];
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int numI = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == -numI) {
                    result.add(Arrays.asList(numI, nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if (nums[left] + nums[right] < -numI) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
