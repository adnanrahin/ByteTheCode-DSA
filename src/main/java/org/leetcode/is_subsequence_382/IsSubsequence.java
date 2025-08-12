package org.leetcode.is_subsequence_382;

public class IsSubsequence {

    public static void main(String[] args) {

        System.out.println(new Solution().isSubsequence("abc", "ahbgdc"));
        System.out.println(new Solution().isSubsequence("axc", "ahbgdc"));
        System.out.println(new Solution().isSubsequence("acb", "ahbgdc"));

    }

    static class Solution {
        public boolean isSubsequence(String s, String t) {

            if(s.isEmpty()) return true;

            int i = 0, j = 0;

            while (i < t.length() && j < s.length()) {

                char ch = t.charAt(i);
                if (ch == s.charAt(j)) {
                    j++;
                }
                i++;

            }

            return j == s.length();
        }
    }
}
