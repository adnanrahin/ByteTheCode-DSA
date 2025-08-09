package org.leetcode.remove_element_27;

public class RemoveElement {

    public static void main(String[] args) {

    }

    static class Solution {
        public int removeElement(int[] nums, int val) {

            int i = 0, j = nums.length - 1;

            while (i <= j) {
                if (nums[j] == val) j--;
                else {
                    if (nums[i] == val) {
                        nums[i++] = nums[j--];
                    } else i++;
                }
            }
            return i;
        }
    }
}
