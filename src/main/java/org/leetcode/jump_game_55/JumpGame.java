package org.leetcode.jump_game_55;

public class JumpGame {

    public static void main(String[] args) {

        System.out.println(new Solution().canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(new Solution().canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(new Solution().canJump(new int[]{3, 2, 2, 0, 4}));
        System.out.println(new Solution().canJump(new int[]{1, 0, 1, 0}));

    }

    static class Solution {
        public boolean canJump(int[] nums) {

            int ptr = 0;

            for (int i = 0; i < nums.length; i++) {
                if (ptr < i) return false;
                ptr = Math.max(i + nums[i], ptr);
            }

            return true;
        }
    }

}
