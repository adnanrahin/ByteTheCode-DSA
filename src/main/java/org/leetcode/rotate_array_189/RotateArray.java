package org.leetcode.rotate_array_189;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};


        new Solution().rotate(nums, 15);

    }

    static class Solution {
        public void rotate(int[] nums, int k) {

            k = k % nums.length;

            int[] cpArray = new int[k];

            for (int i = 0, j = nums.length - k; j < nums.length; j++, i++) {
                cpArray[i] = nums[j];
            }

            for (int i = nums.length - k - 1, j = nums.length - 1; i >= 0; i--, j--) {
                nums[j] = nums[i];
            }

            System.arraycopy(cpArray, 0, nums, 0, cpArray.length);

        }
    }

}
