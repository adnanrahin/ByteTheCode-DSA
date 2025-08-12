package org.leetcode.container_with_most_water_11;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        System.out.println(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(new Solution().maxArea(new int[]{1, 1}));

    }

    static class Solution {
        public int maxArea(int[] height) {
            int maxAreaOfThContainer = 0;

            int left = 0, right = height.length - 1;

            while (left < right) {

                int w = Math.abs(left - right);
                int h = Math.min(height[left], height[right]);
                maxAreaOfThContainer = Math.max(w * h, maxAreaOfThContainer);

                if (height[left] > height[right]) right--;
                else left++;

            }

            return maxAreaOfThContainer;
        }
    }

}
