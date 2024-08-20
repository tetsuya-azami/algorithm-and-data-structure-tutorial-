package neetcode.mathgeometry;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            n = calculateSumOfSquareOfDigits(n);
            if (n == 1) return true;
        }

        return false;
    }

    private int calculateSumOfSquareOfDigits(int target) {
        int sum = 0;
        while (target != 0) {
            sum += (target % 10) * (target % 10);
            target = target / 10;
        }
        return sum;
    }
}
