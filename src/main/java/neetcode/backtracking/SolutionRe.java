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

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2BackTracking(result, new ArrayList<>(), candidates, target, 0);

        return result;
    }

    private void combinationSum2BackTracking(List<List<Integer>> result, List<Integer> subset, int[] candidates, int target, int i) {
        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }
        if (i == candidates.length || target < 0) return;

        subset.add(candidates[i]);
        combinationSum2BackTracking(result, subset, candidates, target - candidates[i], i + 1);
        subset.remove(subset.size() - 1);
        while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
            i++;
        }
        combinationSum2BackTracking(result, subset, candidates, target, i + 1);
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] isVisited = new boolean[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (isTargetChar(board, row, col, word, 0, isVisited)) return true;
            }
        }

        return false;
    }

    private boolean isTargetChar(char[][] board, int row, int col, String word, int wordIndex, boolean[][] isVisited) {
        if (wordIndex == word.length()) return true;
        if (col > board[0].length - 1
                || row > board.length - 1
                || col < 0 || row < 0
                || board[row][col] != word.charAt(wordIndex)
                || isVisited[row][col])
            return false;
        isVisited[row][col] = true;
        boolean result = isTargetChar(board, row, col + 1, word, wordIndex + 1, isVisited)
                || isTargetChar(board, row + 1, col, word, wordIndex + 1, isVisited)
                || isTargetChar(board, row, col - 1, word, wordIndex + 1, isVisited)
                || isTargetChar(board, row - 1, col, word, wordIndex + 1, isVisited);
        isVisited[row][col] = false;

        return result;
    }

    public boolean existOptimal(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (existOptimalDfs(board, row, col, word, 0)) return true;
            }
        }
        return false;
    }

    private boolean existOptimalDfs(char[][] board, int row, int col, String word, int i) {
        if (i == word.length()) return true;
        if (row < 0
                || col < 0
                || row > board.length - 1
                || col > board[0].length - 1
                || board[row][col] != word.charAt(i)) return false;

        board[row][col] = '#';

        boolean result = existOptimalDfs(board, row, col + 1, word, i + 1)
                || existOptimalDfs(board, row + 1, col, word, i + 1)
                || existOptimalDfs(board, row, col - 1, word, i + 1)
                || existOptimalDfs(board, row - 1, col, word, i + 1);
        board[row][col] = word.charAt(i);

        return result;
    }
}