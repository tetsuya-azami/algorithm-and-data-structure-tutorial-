package neetcode.stack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionTest {
    @Test
    public void isValid() {
        String s = "([{}])";
        Solution solution = new Solution();
        boolean result = solution.isValid(s);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void evalRPN() {
        Solution solution = new Solution();
        int result = solution.evalRPN(new String[]{"4", "13", "5", "/", "+"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void generateParenthesis() {
        Solution solution = new Solution();
        List<String> result = solution.generateParenthesis(3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void dailyTemperatures() {
        Solution solution = new Solution();
        int[] result = solution.dailyTemperatures(new int[]{30, 38, 30, 36, 35, 40, 28});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }
}