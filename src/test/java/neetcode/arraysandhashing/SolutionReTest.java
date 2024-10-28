package neetcode.arraysandhashing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionReTest {
    @Test
    public void twoSum() {
        SolutionRe solutionRe = new SolutionRe();
        int[] result = solutionRe.twoSum(new int[]{1, 3, 4, 2}, 6);
        System.out.println();
        System.out.println();
        System.out.println();
        for (int e : result) {
            System.out.println(e + ",");
        }
    }

    @Test
    void groupAnagrams() {
        SolutionRe solution = new SolutionRe();
        List<List<String>> results = solution.groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(results);
    }

    @Test
    void topKFrequent() {
        SolutionRe solution = new SolutionRe();
        int[] result = solution.topKFrequent(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void topKFrequentHeap() {
        SolutionRe solution = new SolutionRe();
        int[] result = solution.topKFrequentHeap(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void encodeAndDecode() {
        SolutionRe solution = new SolutionRe();
        String encoded = solution.encode(new ArrayList<>(Arrays.asList("neet", "code", "love", "you", "5#")));
        List<String> decoded = solution.decode(encoded);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(encoded);
        System.out.println();
        System.out.println(decoded);
    }

    @Test
    void productExceptSelfUsingPrefixSuffix() {
        SolutionRe solution = new SolutionRe();
        int[] result = solution.productExceptSelfUsingPrefixSuffix(new int[]{1, 2, 4, 6});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void productExceptSelf() {
        SolutionRe solution = new SolutionRe();
        int[] result = solution.productExceptSelf(new int[]{1, 2, 4, 6});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void isValidSudoku() {
        SolutionRe solutionRe = new SolutionRe();
        boolean result = solutionRe.isValidSudoku(
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
    void longestConsecutiveBruteForce() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.longestConsecutiveBruteForce(new int[]{2, 20, 4, 10, 3, 4, 5});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void longestConsecutiveSorting() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.longestConsecutiveSorting(new int[]{2, 20, 4, 10, 3, 4, 5});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void longestConsecutiveHashSet() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.longestConsecutiveHashSet(new int[]{2, 20, 4, 10, 3, 4, 5});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}
