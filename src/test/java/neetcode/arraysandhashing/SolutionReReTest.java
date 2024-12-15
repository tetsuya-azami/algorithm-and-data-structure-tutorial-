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
}