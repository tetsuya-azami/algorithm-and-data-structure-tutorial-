package neetcode.arraysandhashing;

import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionReReTest {
    @Test
    void groupAnagrams() {
        SolutionReRe solutionReRe = new SolutionReRe();
        List<List<String>> results = solutionReRe.groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(results);
    }
}