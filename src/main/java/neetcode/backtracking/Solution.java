package neetcode.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        List<Integer> subset = new ArrayList<>();
        subsetDfs(nums, result, subset, 0);

        return result;
    }

    private void subsetDfs(int[] nums, List<List<Integer>> result, List<Integer> subset, int i) {
        if (nums.length - 1 < i) {
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        subsetDfs(nums, result, subset, i + 1);
        subset.remove(subset.size() - 1);
        subsetDfs(nums, result, subset, i + 1);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();
        combinationSumDfs(nums, target, result, new ArrayList<>(), 0);

        return result;
    }

    private void combinationSumDfs(int[] nums, int target, List<List<Integer>> result, List<Integer> subset, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        } else if (target < 0 || nums.length - 1 < index) {
            return;
        }
        subset.add(nums[index]);
        combinationSumDfs(nums, target - nums[index], result, subset, index);
        subset.remove(subset.size() - 1);
        combinationSumDfs(nums, target, result, subset, index + 1);
    }
}