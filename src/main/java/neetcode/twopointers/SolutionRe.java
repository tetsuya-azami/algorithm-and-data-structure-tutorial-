package neetcode.twopointers;

import java.util.*;

public class SolutionRe {
    public int[] twoSumBruteForce(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                } else if (numbers[i] + numbers[j] > target) {
                    break;
                }
            }
        }

        return new int[]{};
    }

    public int[] twoSumTwoPointers(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }

    public List<List<Integer>> threeSumHashMap(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.get(nums[i]) - 1);
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                count.put(nums[j], count.get(nums[j]) - 1);
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int target = -(nums[i] + nums[j]);
                if (count.getOrDefault(target, 0) > 0)
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], target)));
            }

            for (int j = i + 1; j < nums.length; j++) {
                count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
            }
        }

        return result;
    }
}
