package org.leetcode.three_sum_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        System.out.println(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));

    }

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

            List<List<Integer>> solution = new ArrayList<>();

            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                int left = i + 1, right = nums.length - 1;
                while (left < right) {

                    if (right < nums.length - 1 && nums[right] == nums[right + 1]) {
                        right--;
                        continue;
                    }

                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        solution.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                        left++;
                        right--;
                    } else if (sum > 0) right--;
                    else left++;
                }
            }

            return solution;
        }
    }
}
