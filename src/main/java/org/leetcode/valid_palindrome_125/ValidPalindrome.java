package org.leetcode.valid_palindrome_125;

public class ValidPalindrome {


    public static void main(String[] args) {

        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new Solution().isPalindrome("race a car"));
        System.out.println(new Solution().isPalindrome(" "));

    }

    static class Solution {

        public boolean isPalindrome(String s) {

            int left = 0, right = s.length() - 1;

            s = s.toLowerCase();

            while (left <= right) {

                if (!isAlphaNumeric(s.charAt(left))) left++;
                else if (!isAlphaNumeric(s.charAt(right))) right--;
                else if (s.charAt(right) != s.charAt(left)) return false;
                else if (s.charAt(right) == s.charAt(left)) {
                    left++;
                    right--;
                }

            }

            return true;

        }

        public boolean isAlphaNumeric(char ch) {
            return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
        }

    }

}
