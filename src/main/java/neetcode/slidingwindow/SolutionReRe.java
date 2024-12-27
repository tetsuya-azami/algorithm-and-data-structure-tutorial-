package neetcode.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class SolutionReRe {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int result = 0;
        while (right < s.length()) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right++));
            result = Math.max(result, set.size());
        }

        return result;
    }
}
