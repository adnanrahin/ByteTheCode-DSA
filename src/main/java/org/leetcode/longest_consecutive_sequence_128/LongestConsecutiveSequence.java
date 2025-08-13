package org.leetcode.longest_consecutive_sequence_128;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

    }

    static class Solution {
        public int longestConsecutive(int[] nums) {
            int longestConsecutive = 0;

            Set<Integer> consecutiveSeqSet = new HashSet<>();

            for (int num : nums) {
                consecutiveSeqSet.add(num);
            }

            for (int key : consecutiveSeqSet) {
                if (!consecutiveSeqSet.contains(key - 1)) {
                    int currentNum = key;
                    int currentStreak = 1;

                    while (consecutiveSeqSet.contains(currentNum + 1)) {
                        currentNum += 1;
                        currentStreak += 1;
                    }
                    longestConsecutive = Math.max(longestConsecutive, currentStreak);
                }
            }

            return longestConsecutive;
        }
    }

}
