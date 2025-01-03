package neetcode.stack;

import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionReReTest {
    @Test
    public void generateParenthesis() {
        SolutionReRe solutionReRe = new SolutionReRe();
        List<String> result = solutionReRe.generateParenthesis(3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void carFleet() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.carFleet(10, new int[]{6, 8}, new int[]{3, 2});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void carFleet2() {
        SolutionReRe solutionReRe = new SolutionReRe();
        int result = solutionReRe.carFleet(10, new int[]{0, 4, 2}, new int[]{2, 1, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void generateParenthesisRe() {
        SolutionReRe solutionReRe = new SolutionReRe();
        List<String> result = solutionReRe.generateParenthesisRe(3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}