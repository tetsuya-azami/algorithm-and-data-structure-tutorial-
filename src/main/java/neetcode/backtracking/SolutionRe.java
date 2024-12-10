package neetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SolutionRe {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subsetsBackTracking(nums, 0, result, new ArrayList<>());

        return result;
    }

    private void subsetsBackTracking(int[] nums, int index, List<List<Integer>> result, List<Integer> subset) {
        if (index >= nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        subsetsBackTracking(nums, index + 1, result, subset);
        subset.remove(subset.size() - 1);
        subsetsBackTracking(nums, index + 1, result, subset);
    }

    public List<List<Integer>> subsetsIteration(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }

        return result;
    }

    public List<List<Integer>> subsetsBitManipulation(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }

        return result;
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSumBackTracking(result, new ArrayList<>(), nums, target, 0);

        return result;
    }

    private void combinationSumBackTracking(List<List<Integer>> result, List<Integer> subset, int[] nums, int target, int i) {
        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }
        if (target < 0 || i >= nums.length) return;

        subset.add(nums[i]);
        combinationSumBackTracking(result, subset, nums, target - nums[i], i);
        subset.remove(subset.size() - 1);
        combinationSumBackTracking(result, subset, nums, target, i + 1);
    }
}
