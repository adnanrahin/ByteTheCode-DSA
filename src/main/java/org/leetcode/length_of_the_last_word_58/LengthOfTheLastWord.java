package org.leetcode.length_of_the_last_word_58;

public class LengthOfTheLastWord {

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("   fly me   to   the moon  "));
    }

    static class Solution {

        public int lengthOfLastWord(String s) {

            int len = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                if (len >= 0 && s.charAt(i) != ' ') {
                    len++;
                } else if (len > 0 && s.charAt(i) == ' ') return len;
            }

            return len;
        }

    }

}
