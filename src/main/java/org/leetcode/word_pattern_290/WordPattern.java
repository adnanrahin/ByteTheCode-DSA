package org.leetcode.word_pattern_290;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {

    public static void main(String[] args) {

        System.out.println(new Solution().wordPattern("abba", "dog cat cat dog"));
        System.out.println(new Solution().wordPattern("abba", "dog cat cat fish"));

    }

    static class Solution {
        public boolean wordPattern(String pattern, String s) {

            String[] strs = s.split(" ");

            if (strs.length != pattern.length()) return false;

            Map<Character, String> patternMap = new HashMap<>();
            Map<String, Character> strsMap = new HashMap<>();

            for (int i = 0; i < pattern.length(); i++) {
                char ch = pattern.charAt(i);
                patternMap.put(ch, strs[i]);
                strsMap.put(strs[i], ch);
            }

            for (int i = 0; i < strs.length; i++) {
                if (strsMap.get(strs[i]) != pattern.charAt(i) || !Objects.equals(patternMap.get(pattern.charAt(i)), strs[i]))
                    return false;
            }

            return true;
        }
    }

}
