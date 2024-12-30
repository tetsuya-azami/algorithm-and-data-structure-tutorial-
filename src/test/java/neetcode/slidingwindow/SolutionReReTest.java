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

    @Test
    void characterReplacementHashSet() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.characterReplacementHashSet("AABABBA", 1); // 4
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void checkInclusion() {
        SolutionReRe solutionReRe = new SolutionReRe();
        boolean result = solutionReRe.checkInclusion("abc", "lecabeelecabee");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void characterReplacementRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.characterReplacementRe("AABABBA", 1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void lengthOfLongestSubstringRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.lengthOfLongestSubstringRe("zxyzxyz");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void checkInclusionRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        boolean result = solutionReRe.checkInclusionRe("abc", "lecabee");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void isValidSudokuRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        boolean result = solutionReRe.isValidSudokuRe(
                new char[][]{
                        new char[]{'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                        new char[]{'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                        new char[]{'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                        new char[]{'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                        new char[]{'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                        new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        new char[]{'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                        new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                        new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                });
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}