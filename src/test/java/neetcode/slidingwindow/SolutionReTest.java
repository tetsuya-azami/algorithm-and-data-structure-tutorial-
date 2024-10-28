package neetcode.slidingwindow;

import org.junit.jupiter.api.Test;

class SolutionReTest {
    @Test
    void maxProfit() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.maxProfit(new int[]{10, 1, 5, 6, 7, 1});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void maxProfitRe() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.maxProfitRe(new int[]{10, 1, 5, 6, 7, 1});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}