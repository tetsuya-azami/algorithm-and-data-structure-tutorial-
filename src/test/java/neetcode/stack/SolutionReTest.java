package neetcode.stack;

import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionReTest {
    @Test
    void generateParenthesis() {
        SolutionRe solutionRe = new SolutionRe();
        List<String> result = solutionRe.generateParenthesis(3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void carFleet() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.carFleet(10, new int[]{8, 3, 7, 4, 6, 5}, new int[]{4, 4, 4, 4, 4, 4});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}