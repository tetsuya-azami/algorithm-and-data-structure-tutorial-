package neetcode.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

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
}
