package neetcode.twopointers;

public class Solution {
    public boolean isPalindrome(String s) {
        String replaced = s.replaceAll("[^A-za-z0-9]", "").toLowerCase();
        char[] chars = replaced.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left <= right) {
            if (chars[left] != chars[right]) return false;
            left++;
            right--;
        }

        return true;
    }

    public boolean isPalindromeModelAnswer(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }

        return true;
    }
}
