package org.leetcode.isomorphitc_strings_205;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsoMorphicStrings {

    public static void main(String[] args) {

        System.out.println(new Solution().isIsomorphic("abb", "egg"));
        System.out.println(new Solution().isIsomorphic("foo", "bar"));
        System.out.println(new Solution().isIsomorphic("amma", "abba"));
        System.out.println(new Solution().isIsomorphic("paper", "title"));
        System.out.println(new Solution().isIsomorphic("bbbaaaba", "aaabbbba"));

    }

    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) return false;
            Map<Character, Character> sMap = new HashMap<>();
            Map<Character, Character> tMap = new HashMap<>();

            for (int i = 0; i < t.length(); i++) {
                sMap.put(s.charAt(i), t.charAt(i));
                tMap.put(t.charAt(i), s.charAt(i));
            }
            for (int i = 0; i < t.length(); i++) {
                if (sMap.get(s.charAt(i)) != t.charAt(i) || tMap.get(t.charAt(i)) != s.charAt(i)) return false;
            }

            return true;
        }
    }

}
