package org.leetcode.valid_anagrams_242;

public class ValidAnagram {

    public static void main(String[] args) {

    }

    static class Solution {
        public boolean isAnagram(String s, String t) {

            int[] charArray = new int[26];

            if (s.length() != t.length()) return false;

            for (int i = 0; i < s.length(); i++) {
                charArray[s.charAt(i) - 'a']++;
                charArray[t.charAt(i) - 'a']--;
            }

            for (int i = 0; i < 26; i++) {
                if(charArray[i] > 0) return false;
            }

            return true;
        }
    }

}
