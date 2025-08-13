package org.leetcode.contains_duplicate_II;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public static void main(String[] args) {

    }

    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {

            Map<Integer, Integer> rangeMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (rangeMap.containsKey(nums[i])) {
                    int distance = Math.abs(rangeMap.get(nums[i]) - i);
                    if (distance <= k) return true;
                }
                rangeMap.put(nums[i], i);
            }

            return false;
        }
    }

}
