package neetcode.backtracking;

import java.util.*;

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

    public List<List<Integer>> combinationSumOptimal(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        combinationSumOptimalBackTracking(result, subset, nums, target, 0);

        return result;
    }

    private void combinationSumOptimalBackTracking(List<List<Integer>> result, List<Integer> subset, int[] nums, int target, int i) {
        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }

        for (int j = i; j < nums.length; j++) {
            if (target - nums[j] < 0) return;
            subset.add(nums[j]);
            combinationSumOptimalBackTracking(result, subset, nums, target - nums[j], j);
            subset.remove(subset.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Boolean> used = new HashMap<>();
        permuteBackTracking(result, new ArrayList<>(), nums, used);

        return result;
    }

    private void permuteBackTracking(List<List<Integer>> result, List<Integer> subset, int[] nums, Map<Integer, Boolean> used) {
        if (subset.size() == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used.getOrDefault(i, false)) continue;

            subset.add(nums[i]);
            used.put(i, true);
            permuteBackTracking(result, subset, nums, used);

            subset.remove(subset.size() - 1);
            used.put(i, false);
        }
    }

    public List<List<Integer>> permuteRecursion(int[] nums) {
        if (nums.length == 0) return Arrays.asList(new ArrayList<>());

        int num = nums[0];
        List<List<Integer>> permute = permuteRecursion(Arrays.copyOfRange(nums, 1, nums.length));
        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> p : permute) {
            for (int i = 0; i <= p.size(); i++) {
                List<Integer> copy = new ArrayList<>(p);
                copy.add(i, num);
                result.add(copy);
            }
        }

        return result;
    }

    public List<List<Integer>> permuteIteration(int[] nums) {
        List<List<Integer>> perms = new ArrayList<>();
        perms.add(new ArrayList<>());
        for (int num : nums) {
            List<List<Integer>> newParms = new ArrayList<>();
            for (List<Integer> p : perms) {
                for (int i = 0; i <= p.size(); i++) {
                    List<Integer> perm = new ArrayList<>(p);
                    perm.add(i, num);
                    newParms.add(perm);
                }
            }
            perms = newParms;
        }

        return perms;
    }

    public List<List<Integer>> permuteBackTrackOptimal(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, int[] nums, int idx) {
        if (idx == nums.length) {
            List<Integer> subset = new ArrayList<>();
            for (int num : nums) subset.add(num);
            result.add(subset);
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            backtrack(result, nums, idx + 1);
            swap(nums, idx, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public List<List<Integer>> subsetsWithDupBruteForce(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        subsetsWithDupBackTracking(result, new ArrayList<>(), nums, 0);

        return new ArrayList<>(result);
    }

    private void subsetsWithDupBackTracking(Set<List<Integer>> result, List<Integer> subset, int[] nums, int i) {
        if (i == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        subsetsWithDupBackTracking(result, subset, nums, i + 1);
        subset.remove(subset.size() - 1
        );
        subsetsWithDupBackTracking(result, subset, nums, i + 1);
    }

    public List<List<Integer>> subsetsWithDupPickAndNotPick(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        subsetsWithDupPickAndNotPickBackTracking(result, new ArrayList<>(), nums, 0);

        return result;
    }

    private void subsetsWithDupPickAndNotPickBackTracking(List<List<Integer>> result, List<Integer> subset, int[] nums, int i) {
        if (i == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        subsetsWithDupPickAndNotPickBackTracking(result, subset, nums, i + 1);

        subset.remove(subset.size() - 1);
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }
        subsetsWithDupPickAndNotPickBackTracking(result, subset, nums, i + 1);
    }
}