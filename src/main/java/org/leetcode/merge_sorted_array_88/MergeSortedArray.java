package org.leetcode.merge_sorted_array_88;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        new Solution().merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));


        int[] nums3 = new int[]{0};
        int[] nums4 = new int[]{1};

        new Solution().merge(nums3, 0, nums4, 1);

        System.out.println(Arrays.toString(nums3));


        int[] nums5 = new int[]{4, 5, 6, 0, 0, 0};
        int[] nums6 = new int[]{1, 2, 3};

        new Solution().merge(nums5, 3, nums6, 3);

        System.out.println(Arrays.toString(nums5));

    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int index = m + n - 1;
            int i = nums1.length - m - 1, j = n - 1;
            while (i >= 0 && j >= 0) {
                if (nums1[i] < nums2[j]) {
                    nums1[index] = nums2[j];
                    index--;
                    j--;
                } else {
                    nums1[index--] = nums1[i];
                    nums1[i] = nums2[j];
                    i--;
                }
            }
            while (j >= 0) {
                nums1[index--] = nums2[j--];
            }
        }
    }

}

