package neetcode.binarysearch;

import java.util.Arrays;

public class SolutionRe {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().orElseThrow();
        int left = 1;
        int right = max;
        while (left < right) {
            int eatPerHour = (left + right) / 2;
            int takeTime = 0;
            for (int i = 0; i < piles.length; i++) {
                takeTime += (int) Math.ceil((double) piles[i] / eatPerHour);
            }

            if (takeTime <= h) {
                right = eatPerHour;
            } else {
                left = eatPerHour + 1;
            }
        }

        return right;
    }
}
