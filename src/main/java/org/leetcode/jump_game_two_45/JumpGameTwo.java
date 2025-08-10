package org.leetcode.jump_game_two_45;

public class JumpGameTwo {

    public static void main(String[] args) {

    }

    static class Solution {
        public int jump(int[] nums) {

            if (nums.length < 2) return 0;

            int minJump = 0;
            int currentJumpRange = nums[0];
            int maxJumpRange = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (i > currentJumpRange) {
                    minJump++;
                    currentJumpRange = maxJumpRange;
                }
                maxJumpRange = Math.max(maxJumpRange, i + nums[i]);
            }

            return minJump + 1;
        }
    }

}
