package neetcode.arraysandhashing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionReReTest {
    @Test
    void groupAnagrams() {
        SolutionReRe solutionReRe = new SolutionReRe();
        List<List<String>> results = solutionReRe.groupAnagramsRe(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(results);
    }

    @Test
    void encodeAndDecode() {
        SolutionReRe solutionReRe = new SolutionReRe();
        String encoded = solutionReRe.encode(new ArrayList<>(Arrays.asList("neet", "code", "love", "you")));
        List<String> decoded = solutionReRe.decode(encoded);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(encoded);
        System.out.println();
        System.out.println(decoded);
    }

    @Test
    void longestConsecutive() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.longestConsecutive(new int[]{2, 20, 4, 10, 3, 4, 5});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void longestConsecutiveSorting() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.longestConsecutiveSorting(new int[]{100, 4, 200, 1, 3, 2});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void longestConsecutiveHashSet() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.longestConsecutiveHashSet(new int[]{100, 4, 200, 1, 3, 2});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void productExceptSelf() {
        SolutionReRe solution = new SolutionReRe();
        int[] result = solution.productExceptSelf(new int[]{1, 2, 4, 6});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void topKFrequentSortN() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int[] result = solutionReRe.topKFrequentSortN(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void topKFrequentHeap() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int[] result = solutionReRe.topKFrequentHeap(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void topKFrequentBucketSort() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int[] result = solutionReRe.topKFrequentBucketSort(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void encodeAndDecodeRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        String encoded = solutionReRe.encodeRe(new ArrayList<>(Arrays.asList("we", "say", ":", "yes", "!@#$%^&*()")));
        List<String> decoded = solutionReRe.decodeRe(encoded);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(encoded);
        System.out.println();
        System.out.println(decoded);
    }

    @Test
    void groupAnagramsReReRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        List<List<String>> results = solutionReRe.groupAnagramsReReRe(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(results);
    }

    @Test
    void longestConsecutiveRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.longestConsecutiveRe(new int[]{2, 20, 4, 10, 3, 4, 5});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void productExceptSelfRe() {
        SolutionReRe solution = new SolutionReRe();
        int[] result = solution.productExceptSelfRe(new int[]{1, 2, 4, 6});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void topKFrequentRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int[] result = solutionReRe.topKFrequentRe(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void topKFrequentBucket() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int[] result = solutionReRe.topKFrequentBucket(new int[]{7, 7}, 1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void longestConsecutiveRetry() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.longestConsecutiveRetry(new int[]{2, 20, 4, 10, 3, 4, 5});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void isValidSudoku() {
        SolutionReRe solutionReRe = new SolutionReRe();
        boolean result = solutionReRe.isValidSudoku(
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