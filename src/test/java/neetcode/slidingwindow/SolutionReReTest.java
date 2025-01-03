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

    @Test
    void characterReplacementReRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.characterReplacementReRe("AABABBA", 1); // 4
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void lengthOfLongestSubstringReRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.lengthOfLongestSubstringReRe("zxyzxyz");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void checkInclusionReRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        boolean result = solutionReRe.checkInclusionReRe("abc", "lecabeelecabee");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void carFleet() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.carFleet(10, new int[]{4, 1, 0, 7}, new int[]{2, 2, 1, 1});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void carFleet2() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.carFleet(10, new int[]{1, 4}, new int[]{3, 2});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void carFleet3() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.carFleet(10, new int[]{0, 4, 2}, new int[]{2, 1, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void findMinRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.findMinRe(new int[]{4, 5, 0, 1, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}