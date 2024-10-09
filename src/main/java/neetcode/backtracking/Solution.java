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
}
