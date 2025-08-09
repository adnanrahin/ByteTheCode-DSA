package org.leetcode.remove_duplicates_from_sorted_array_26;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] nums = new int[]{0, 0, 1, 1, 2, 2, 2, 3, 3, 4};

        System.out.println(new Solution().removeDuplicates(nums));

    }

    static class Solution {

        public int removeDuplicates(int[] nums) {
            int slow = 0;
            for (int fast = 0; fast < nums.length; fast++) {
                if (nums[fast] != nums[slow]) {
                    slow++;
                    nums[slow] = nums[fast];
                }
            }
            return slow;
        }
    }
}
