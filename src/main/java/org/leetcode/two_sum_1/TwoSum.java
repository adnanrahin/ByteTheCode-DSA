package org.leetcode.two_sum_1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {

            Map<Integer, Integer> twoSumMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int sum = target - nums[i];
                if (twoSumMap.containsKey(sum)) {
                    return new int[]{twoSumMap.get(sum), i};
                }
                twoSumMap.put(nums[i], i);
            }

            return new int[]{};
        }
    }

}
