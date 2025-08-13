package org.leetcode.trapping_rain_water_42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrappingRainWater {

    public static void main(String[] args) {

        System.out.println(new Solution().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(new Solution().trap(new int[]{4, 2, 0, 3, 2, 5}));

    }

    static class Solution {
        public int trap(int[] heights) {
            int totalWater = 0;
            int n = heights.length;

            int[] leftMax = new int[n];
            int[] rightMax = new int[n];

            leftMax[0] = heights[0];
            rightMax[n - 1] = heights[n - 1];

            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
            }

            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
            }

            for (int i = 0; i < n; i++) {
                int waterLevel = Math.min(leftMax[i], rightMax[i]);
                totalWater += waterLevel - heights[i];
            }

            return totalWater;
        }
    }

}
