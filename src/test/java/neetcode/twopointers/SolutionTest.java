package neetcode.twopointers;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void isPalindrome() {
        String s = "Was it a car or a cat I saw?";
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(s);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void isPalindromeModelAnswer() {
        String s = "Was it a car or a cat I saw?";
        Solution solution = new Solution();
        boolean result = solution.isPalindromeModelAnswer(s);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}
