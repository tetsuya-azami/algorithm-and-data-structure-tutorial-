package neetcode.stack;

import org.junit.jupiter.api.Test;

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
}