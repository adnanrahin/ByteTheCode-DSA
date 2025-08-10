package org.leetcode.product_of_array_except_self_238;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

    }

    public int[] productExceptSelf(int[] nums) {

        int[] prefixArray = new int[nums.length];
        int[] solution = new int[nums.length];
        int[] suffixArray = new int[nums.length];
        int n = nums.length;
        prefixArray[0] = 1;
        suffixArray[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            prefixArray[i] = prefixArray[i - 1] * nums[i - 1]; // prefixArray = [1, 1, 2, 6]
        }

        for (int i = n - 2; i >= 0; i--) {
            suffixArray[i] = suffixArray[i + 1] * nums[i + 1]; // suffixArray = [24, 12, 4, 1]
        }

        for (int i = 0; i < n; i++) {
            solution[i] = suffixArray[i] * prefixArray[i];
        }

        return solution;
    }

    static class Solution {
        public int[] productExceptSelf(int[] nums) {

            int[] solution = new int[nums.length];

            solution[0] = 1;

            for (int i = 1; i < nums.length; i++) {
                solution[i] = solution[i - 1] * nums[i - 1];
            }
            int suffix = 1;

            for (int i = nums.length - 1; i >= 0; i--) {
                solution[i] = suffix * solution[i];
                suffix = suffix * nums[i];
            }

            return solution;
        }
    }

}
