package org.leetcode.sum_of_digits_of_strings_after_convert;

import java.util.HashMap;
import java.util.Map;

public class SumOfDigitsOfStringAfterConvert {

    public static void main(String[] args) {


        System.out.println(new Solution().getLucky("zbax", 2));
        System.out.println(new Solution().getLucky("leetcode", 2));
        System.out.println(new Solution().getLucky("iiii", 1));

    }

    static class Solution {

        public int getLucky(String s, int k) {


            StringBuilder numberStr = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                numberStr.append(s.charAt(i) - 'a' + 1);
            }

            int number = 0;

            for (int i = 0; i < numberStr.length(); i++) {
                number += (int) (numberStr.charAt(i) - '0');
            }

            int i = 1;

            while (i < k) {
                number = transForm(number);
                i++;
            }

            return number;
        }

        public int transForm(int number) {

            int numberSum = 0;

            while (number != 0) {
                int mod = number % 10;
                number = number / 10;
                numberSum += mod;
            }

            return numberSum;
        }

    }

}
