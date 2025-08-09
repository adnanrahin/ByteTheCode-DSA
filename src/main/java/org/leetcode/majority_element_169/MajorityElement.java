package org.leetcode.majority_element_169;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        System.out.println(new Solution().majorityElement(new int[]{3, 2, 3}));
        System.out.println(new Solution().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));

    }

    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }


    static class Solution {

        public int majorityElement(int[] nums) {

            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            int majorityElement = nums[0];
            int countMajorityElement = map.get(nums[0]);

            for (int i = 0; i < nums.length; i++) {
                if (countMajorityElement < map.get(nums[i])) {
                    majorityElement = nums[i];
                    countMajorityElement = map.get(nums[i]);
                }
            }
            return majorityElement;
        }

    }

}
