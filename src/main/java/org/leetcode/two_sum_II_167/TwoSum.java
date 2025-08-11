package org.leetcode.two_sum_II_167;

public class TwoSum {

    public static void main(String[] args) {

    }

    static class Solution {
        public int[] twoSum(int[] numbers, int target) {

            int left = 0, right = numbers.length - 1;

            while (left <= right) {
                if (numbers[left] + numbers[right] == target) return new int[]{left + 1, right + 1};
                else if (numbers[left] + numbers[right] > target) {
                    right--;
                } else left++;
            }

            return new int[]{-1, -1};
        }
    }

}
