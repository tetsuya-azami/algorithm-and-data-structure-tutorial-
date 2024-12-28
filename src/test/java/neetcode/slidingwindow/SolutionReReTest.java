package neetcode.slidingwindow;

import org.junit.jupiter.api.Test;

class SolutionReReTest {
    @Test
    void lengthOfLongestSubstring() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.lengthOfLongestSubstring("zxyzxyz");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void lengthOfLongestSubstring2() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.lengthOfLongestSubstring("pwwkew");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void lengthOfLongestSubstring3() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.lengthOfLongestSubstring("abba");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void characterReplacement() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.characterReplacement("AABABBA", 1); // 4
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void characterReplacementBruteForce() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.characterReplacementBruteForce("AABABBA", 1); // 4
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}