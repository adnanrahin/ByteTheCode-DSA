package org.leetcode.ransome_note_383;

import java.util.Arrays;

public class RansomNote {

    public static void main(String[] args) {

        System.out.println(new Solution().canConstruct("a", "b"));
        System.out.println(new Solution().canConstruct("abc", "ab"));

    }

    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            if (ransomNote.length() > magazine.length()) return false;

            int[] alphaArray = new int[26];
            for (int i = 0; i < magazine.length(); i++) {
                alphaArray[magazine.charAt(i) - 'a']++;
                if (i < ransomNote.length()) {
                    alphaArray[ransomNote.charAt(i) - 'a']--;
                }
            }

            for (int i = 0; i < ransomNote.length(); i++) {
                if (alphaArray[ransomNote.charAt(i) - 'a'] < 0) return false;
            }

            return true;
        }
    }

}
