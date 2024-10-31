package neetcode.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class SolutionRe {

    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minimum) minimum = prices[i];
            maxProfit = Math.max(maxProfit, prices[i] - minimum);
        }

        return maxProfit;
    }

    public int maxProfitTwoPointers(int[] prices) {
        int left = 0;
        int right = 0;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[right] < prices[left]) left = right;
            maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            right++;
        }

        return maxProfit;
    }

    public int maxProfitRe(int[] prices) {
        int minPricePointer = 0;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            // 最低価格を更新
            if (prices[i] < prices[minPricePointer]) {
                minPricePointer = i;
            }
            // 最高利益を更新
            result = Math.max(result, prices[i] - prices[minPricePointer]);
        }

        return result;
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                result = Math.max(result, set.size());
                right++;
            }
        }

        return result;
    }

    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int[] charCounts = new int[26];
        int max = 0;
        int result = 0;
        while (right < s.length()) {
            charCounts[s.charAt(right) - 'A']++;
            max = Math.max(max, charCounts[s.charAt(right) - 'A']);

            if (right - left + 1 - max > k) {
                charCounts[s.charAt(left) - 'A']--;
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;
    }

    public boolean checkInclusion(String s1, String s2) {
        int[] s1CharCounts = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1CharCounts[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();
        int left = 0;
        int[] s2CharCounts = new int[26];
        for (int right = 0; right < s2.length(); right++) {
            if (right - left + 1 > windowSize) {
                s2CharCounts[s2.charAt(left) - 'a']--;
                left++;
            }
            s2CharCounts[s2.charAt(right) - 'a']++;
            for (int i = 0; i < 26; i++) {
                if (s1CharCounts[i] == s2CharCounts[i]) {
                    if (i == 25) return true;
                } else {
                    break;
                }
            }
        }

        return false;
    }
}
