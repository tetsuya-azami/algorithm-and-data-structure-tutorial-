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
}
