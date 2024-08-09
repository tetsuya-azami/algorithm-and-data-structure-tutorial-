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
}