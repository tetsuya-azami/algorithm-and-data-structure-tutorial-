package neetcode.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public int characterReplacementBruteForce(String s, int k) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            int maxf = 0;
            for (int j = i; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                maxf = Math.max(maxf, map.get(s.charAt(j)));

                if ((j - i + 1) - maxf <= k) {
                    result = Math.max(result, j - i + 1);
                }
            }
        }

        return result;
    }

    public int characterReplacementHashSet(String s, int k) {
        Set<Character> set = new HashSet<>();
        for (Character c : s.toCharArray()) {
            set.add(c);
        }

        int result = 0;
        for (Character c : set) {
            int count = 0;
            int l = 0;
            for (int r = 0; r < s.length(); r++) {
                if (s.charAt(r) == c) count++;
                while (l < r && (r - l + 1) - count > k) {
                    if (s.charAt(l) == c) count--;
                    l++;
                }
                result = Math.max(result, r - l + 1);
            }
        }

        return result;
    }
}
