package neetcode.mathgeometry;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int target = n;
        while (true) {
            int calculated = calculateSumOfSquareOfDigits(target);
            if (calculated == 1) return true;

            if (set.contains(calculated)) return false;
            set.add(calculated);
            target = calculated;
        }
    }

    private int calculateSumOfSquareOfDigits(int target) {
        int length = String.valueOf(target).length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                sum += target * target;
                continue;
            }

            int digit = (int) (target / Math.pow(10, (length - (i + 1))));
            sum += digit * digit;
            target -= (int) (digit * Math.pow(10, (length - (i + 1))));
        }
        return sum;
    }
}
