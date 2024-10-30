package neetcode.slidingwindow;

import org.junit.jupiter.api.Test;

class SolutionReTest {
    @Test
    void maxProfit() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.maxProfit(new int[]{10, 1, 5, 6, 7, 1});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void maxProfitRe() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.maxProfitRe(new int[]{10, 1, 5, 6, 7, 1});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void lengthOfLongestSubstring() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.lengthOfLongestSubstring("zxyzxyz");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void characterReplacement() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.characterReplacement("AABABBA", 1); // 4
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}