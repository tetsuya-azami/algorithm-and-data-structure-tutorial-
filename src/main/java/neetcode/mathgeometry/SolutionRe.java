package neetcode.mathgeometry;

import java.util.HashSet;

public class SolutionRe {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            int tmp = 0;
            while (n != 0) {
                int remainder = n % 10;
                tmp += Math.pow(remainder, 2);
                n /= 10;
            }
            if (set.contains(tmp)) return false;
            set.add(tmp);
            n = tmp;
        }

        return true;
    }

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            carry = 0;
            if (digits[i] == 10) {
                carry = 1;
                digits[i] = 0;
            }
        }

        if (carry == 1) {
            int[] tmp = new int[digits.length + 1];
            tmp[0] = 1;
            for (int i = 1; i < tmp.length; i++) {
                tmp[i] = digits[i - 1];
            }
            digits = tmp;
        }

        return digits;
    }
}
