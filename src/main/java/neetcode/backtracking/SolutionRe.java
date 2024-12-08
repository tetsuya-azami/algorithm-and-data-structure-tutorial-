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
}
