package org.leetcode.summary_ranges_228;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SummaryRanges {

    public static void main(String[] args) {

        System.out.println(new Solution().summaryRanges(new int[]{3, 4, 5, 7, 11, 12}));

    }

    static class Solution {
        public List<String> summaryRanges(int[] nums) {

            if(nums.length == 0) return new ArrayList<>();

            List<String> solution = new ArrayList<>();

            List<String> sb = new ArrayList<>();


            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    sb.add(String.valueOf(nums[i]));
                } else if (nums[i] - 1 == nums[i - 1]) {
                    sb.add(String.valueOf(nums[i]));
                } else {

                    if (!Objects.equals(sb.get(0), sb.get(sb.size() - 1)))
                        solution.add(sb.get(0) + "->" + sb.get(sb.size() - 1));
                    else
                        solution.add(String.valueOf(sb.get(0)));

                    sb = new ArrayList<>();
                    sb.add(String.valueOf(nums[i]));
                }

            }

            if (!sb.isEmpty() && !Objects.equals(sb.get(0), sb.get(sb.size() - 1)))
                solution.add(sb.get(0) + "->" + sb.get(sb.size() - 1));
            else
                solution.add(String.valueOf(sb.get(0)));

            return solution;
        }
    }

}
