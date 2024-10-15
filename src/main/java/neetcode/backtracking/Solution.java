package neetcode.backtracking;

import java.util.*;

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

    public boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (findNextCharacter(board, word, row, col, new HashSet<>(), 0)) return true;
            }
        }

        return false;
    }

    private boolean findNextCharacter(char[][] board, String word, int row, int col, HashSet<String> used, int curCharIndex) {
        String key = String.format("%s-%s", col, row);
        if (used.contains(key) || col < 0 || board[0].length - 1 < col || row < 0 || board.length - 1 < row || word.charAt(curCharIndex) != board[row][col]) {
            return false;
        }
        if (curCharIndex == word.length() - 1) return true;

        curCharIndex++;
        used.add(key);

        boolean result =
                findNextCharacter(board, word, row + 1, col, used, curCharIndex) ||
                        findNextCharacter(board, word, row - 1, col, used, curCharIndex) ||
                        findNextCharacter(board, word, row, col + 1, used, curCharIndex) ||
                        findNextCharacter(board, word, row, col - 1, used, curCharIndex);
        used.remove(key);

        return result;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> part = new ArrayList<>();
        partitionDfs(result, part, s, 0);

        return result;
    }

    private void partitionDfs(List<List<String>> result, List<String> part, String s, int i) {
        if (i > s.length() - 1) {
            result.add(new ArrayList<>(part));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            String substring = s.substring(i, j + 1);
            if (isPalindrome(substring)) {
                part.add(substring);
                partitionDfs(result, part, s, j + 1);
                part.remove(part.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();
        Map<Character, String> map = createMap();
        List<String> result = new ArrayList<>();
        letterCombinationsDfs(result, new StringBuilder(), map, digits, 0);

        return result;
    }

    private void letterCombinationsDfs(List<String> result, StringBuilder subset, Map<Character, String> map, String digits, int index) {
        if (index >= digits.length()) {
            result.add(subset.toString());
            return;
        }
        String phoneChars = map.get(digits.charAt(index));
        for (Character c : phoneChars.toCharArray()) {
            subset.append(c);
            letterCombinationsDfs(result, subset, map, digits, index + 1);
            subset.deleteCharAt(subset.length() - 1);
        }
    }

    private Map<Character, String> createMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        return map;
    }
}