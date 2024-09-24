package neetcode.stack;

import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> brackets = new ArrayDeque<>();
        List<Character> openBrackets = Arrays.asList('(', '{', '[');
        List<Character> closeBrackets = Arrays.asList(')', '}', ']');
        for (int i = 0; i < s.length(); i++) {
            if (openBrackets.contains(s.charAt(i))) {
                brackets.addLast(s.charAt(i));
            } else if (closeBrackets.contains(s.charAt(i))) {
                if (brackets.isEmpty()) return false;
                Character retrieved = brackets.getLast();
                brackets.removeLast();
                if (openBrackets.indexOf(retrieved) != closeBrackets.indexOf(s.charAt(i))) return false;
            } else {
                throw new RuntimeException(String.format("bracket以外の文字列が混入しています。index: %s, 対象文字: %s", i, s.charAt(i)));
            }
        }

        return brackets.isEmpty();
    }

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+" -> {
                    Integer operand1 = stack.pop();
                    Integer operand2 = stack.pop();
                    stack.push(operand2 + operand1);
                }
                case "-" -> {
                    Integer operand1 = stack.pop();
                    Integer operand2 = stack.pop();
                    stack.push(operand2 - operand1);
                }
                case "*" -> {
                    Integer operand1 = stack.pop();
                    Integer operand2 = stack.pop();
                    stack.push(operand2 * operand1);
                }
                case "/" -> {
                    Integer operand1 = stack.pop();
                    Integer operand2 = stack.pop();
                    stack.push(operand2 / operand1);
                }
                default -> stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }

    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        Deque<Character> stack = new ArrayDeque<>();
        backtrack(n, 0, 0, stack, results);
        return results;
    }

    private void backtrack(int n, int openN, int closedN, Deque<Character> stack, List<String> results) {
        if (openN == closedN && openN == n) {
            StringBuilder sb = new StringBuilder();
            Iterator<Character> it = stack.descendingIterator();
            while (it.hasNext()) {
                sb.append(it.next());
            }
            results.add(sb.toString());
            return;
        }

        if (openN < n) {
            stack.push('(');
            backtrack(n, openN + 1, closedN, stack, results);
            stack.pop();
        }

        if (closedN < openN) {
            stack.push(')');
            backtrack(n, openN, closedN + 1, stack, results);
            stack.pop();
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    results[i] = j - i;
                    break;
                }
            }
        }

        return results;
    }

    public int[] dailyTemperaturesWithStack(int[] temperatures) {
        int[] results = new int[temperatures.length];

        Deque<int[]> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek()[0] < temperatures[i]) {
                int[] pair = stack.pop();
                results[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }

        return results;
    }

    public int carFleet(int target, int[] position, int[] speed) {
        double[][] pairs = new double[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Arrays.sort(pairs, (a, b) -> Double.compare(b[0], a[0]));
        double[] timeToReaches = new double[pairs.length];
        int result = 0;

        for (int i = 0; i < pairs.length; i++) {
            double timeToReach = (target - pairs[i][0]) / pairs[i][1];
            timeToReaches[i] = timeToReach;
            if (i >= 1 && timeToReaches[i] <= timeToReaches[i - 1]) {
                timeToReaches[i] = timeToReaches[i - 1];
            } else {
                result++;
            }
        }

        return result;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int targetRow = -1;
        int top = 0;
        int last = matrix.length - 1;

        while (top <= last) {
            int middle = (top + last) / 2;
            if (target < matrix[middle][0]) {
                last = middle - 1;
            } else if (matrix[middle][matrix[middle].length - 1] < target) {
                top = middle + 1;
            } else {
                targetRow = middle;
                break;
            }
        }
        if (targetRow == -1) return false;

        int left = 0;
        int right = matrix[targetRow].length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            int middleValue = matrix[targetRow][middle];
            if (target < middleValue) {
                right = middle - 1;
            } else if (middleValue < target) {
                left = middle + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int k = right;
        while (left <= right) {
            int middle = (left + right) / 2;
            int totalTime = 0;
            for (int i = 0; i < piles.length; i++) {
                totalTime += Math.ceil((double) piles[i] / middle);
            }
            if (totalTime <= h) {
                k = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return k;
    }

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] <= nums[r]) {
                return nums[l];
            }
            int middle = (l + r) / 2;
            if (nums[middle] < nums[l]) {
                r = middle;
            } else {
                l = middle + 1;
            }
        }

        return 0;
    }
}
