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
}
