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
}