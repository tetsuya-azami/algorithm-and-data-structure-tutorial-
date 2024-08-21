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

    public int[] plusOne(int[] digits) {
        int carry = 1;
        int[] result = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i] + carry;
            if (digit == 10) {
                digit = 0;
            } else {
                carry = 0;
            }
            result[i] = digit;
        }

        if (carry == 1) {
            int[] newResult = new int[digits.length + 1];
            newResult[0] = 1;
            System.arraycopy(result, 0, newResult, 1, digits.length);
            result = newResult;
        }

        return result;
    }
}
