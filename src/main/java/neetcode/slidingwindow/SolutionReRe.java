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

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]) matches++;
        }

        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {
            if (matches == 26) return true;

            int index = s2.charAt(l) - 'a';
            s2Count[index]--;
            if (s1Count[index] == s2Count[index]) {
                matches++;
            } else if (s1Count[index] - 1 == s2Count[index]) {
                matches--;
            }
            l++;

            index = s2.charAt(r) - 'a';
            s2Count[index]++;
            if (s1Count[index] == s2Count[index]) {
                matches++;
            } else if (s1Count[index] + 1 == s2Count[index]) {
                matches--;
            }
        }

        return matches == 26;
    }

    public int characterReplacementRe(String s, int k) {
        int l = 0;
        int result = 0;
        int maxf = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int r = l; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, map.get(s.charAt(r)));
            if ((r - l + 1) - maxf > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            result = Math.max(result, r - l + 1);
        }

        return result;
    }

    public int lengthOfLongestSubstringRe(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int l = 0;
        int result = 0;
        for (int r = 0; r < s.length(); r++) {
            if (charIndexMap.containsKey(s.charAt(r))) {
                Integer index = charIndexMap.get(s.charAt(r));
                while (l <= index) {
                    charIndexMap.remove(s.charAt(l));
                    l++;
                }
                charIndexMap.put(s.charAt(r), r);
            } else {
                charIndexMap.put(s.charAt(r), r);
                result = Math.max(result, r - l + 1);
            }
        }

        return result;
    }
}
