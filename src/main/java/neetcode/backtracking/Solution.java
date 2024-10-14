package neetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
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

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length == 1) {
            result.add(new ArrayList<>(List.of(nums[0])));
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int index = 0;
            int[] remainingNums = new int[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    remainingNums[index++] = nums[j];
                }
            }

            List<List<Integer>> permutes = permute(remainingNums);
            for (List<Integer> permute : permutes) {
                permute.add(n);
                result.add(new ArrayList<>(permute));
            }
        }

        return result;
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, new ArrayList<>(), nums, res);
        return res;
    }

    private void backtrack(int start, List<Integer> subset, int[] nums, List<List<Integer>> res) {
        res.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i - 1] == nums[i]) continue;
            subset.add(nums[i]);
            backtrack(i + 1, subset, nums, res);
            subset.remove(subset.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2Backtrack(result, subset, candidates, target, 0, 0);
        return result;
    }

    // 1, 2, 2, 4, 5, 6, 9
    private void combinationSum2Backtrack(
            List<List<Integer>> result, List<Integer> subset, int[] candidates, int target, int sum, int index) {
        if (sum == target) {
            result.add(new ArrayList<>(subset));
            return;
        }
        if (sum > target || index == candidates.length) {
            return;
        }
        subset.add(candidates[index]);
        combinationSum2Backtrack(result, subset, candidates, target, sum + candidates[index], index + 1);
        subset.remove(subset.size() - 1);
        while (index + 1 < candidates.length && candidates[index] == candidates[index + 1]) {
            index++;
        }
        combinationSum2Backtrack(result, subset, candidates, target, sum, index + 1);
    }
}