package org.leetcode.longest_common_prefix_14;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));

    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            String prefix = "";


            String shortestString = strs[0];

            int shortestLen = strs[0].length();

            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < shortestLen) {
                    shortestLen = strs[i].length();
                    shortestString = strs[i];
                }
            }

            for (int i = 0; i < shortestString.length(); i++) {
                char ch = shortestString.charAt(i);
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].charAt(i) != ch) return prefix;
                }
                prefix += ch;
            }

            return prefix;
        }


    }

}
