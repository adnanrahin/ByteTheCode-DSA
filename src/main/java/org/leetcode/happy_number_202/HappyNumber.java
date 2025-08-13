package org.leetcode.happy_number_202;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {

        System.out.println(new Solution().isHappy(19));
        System.out.println(new Solution().isHappy(2));

    }

    static class Solution {
        public boolean isHappy(int n) {
            Set<Integer> set = new HashSet<>();
            while (n > 1) {
                if (!set.add(n)) return false;
                int sum = 0;
                while (n != 0) {
                    int mod = n % 10;
                    n = n / 10;
                    sum += (int) Math.pow(mod, 2);
                }

                n = sum;
            }

            return n == 1;
        }
    }

}
