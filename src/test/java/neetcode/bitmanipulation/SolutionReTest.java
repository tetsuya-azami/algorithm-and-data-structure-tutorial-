package neetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

class SolutionReTest {

    @Test
    public void singleNumber() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.singleNumber(new int[]{3, 2, 3});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void hammingWeight() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.hammingWeight(23);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void hammingWeight2() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.hammingWeight2(23);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void countBits() {
        SolutionRe solutionRe = new SolutionRe();
        int[] result = solutionRe.countBits(4);
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
        System.out.println();
    }

    @Test
    public void countBits2() {
        SolutionRe solutionRe = new SolutionRe();
        int[] result = solutionRe.countBits2(4);
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
        System.out.println();
    }

    @Test
    public void reverseBits() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.reverseBits(21);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}