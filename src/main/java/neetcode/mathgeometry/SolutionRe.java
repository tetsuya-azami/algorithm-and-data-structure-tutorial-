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
}
