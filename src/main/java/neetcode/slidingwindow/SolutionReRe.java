package neetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SolutionReRe {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (map.containsKey(s.charAt(r))) {
                l = Math.max(l, map.get(s.charAt(r)) + 1);
            }
            map.put(s.charAt(r), r);
            result = Math.max(result, r - l + 1);
        }

        return result;
    }

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int maxf = 0;
        int result = 0;
        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, map.get(s.charAt(r)));

            while (l < r && (r - l + 1) - maxf > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            result = Math.max(result, r - l + 1);
        }

        return result;
    }
}
