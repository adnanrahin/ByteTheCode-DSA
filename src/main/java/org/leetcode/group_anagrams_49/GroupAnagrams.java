package org.leetcode.group_anagrams_49;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        System.out.println(new Solution().sortString("ATE"));

        System.out.println(new Solution().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

    }

    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            if (strs.length == 0) return new ArrayList<>();

            List<List<String>> solutions = new ArrayList<>();

            Map<String, List<String>> stringListMap = new HashMap<>();

            for (int i = 0; i < strs.length; i++) {
                String s = strs[i];
                String sortedString = sortString(s);
                if (!stringListMap.containsKey(sortedString)) {
                    stringListMap.put(sortedString, new ArrayList<>());
                }
                stringListMap.get(sortedString).add(strs[i]);
            }
            for (String key : stringListMap.keySet()) {
                solutions.add(stringListMap.get(key));
            }

            return solutions;
        }

        public String sortString(String str) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            return Arrays.toString(charArray);
        }

    }

}
