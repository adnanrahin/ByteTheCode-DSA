package org.leetcode.best_time_to_buy_stock_two_122;

public class BestTimeToBuyAndSellStockTwo {

    public static void main(String[] args) {

        System.out.println(new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

    }

    static class Solution {

        public int maxProfit(int[] prices) {

            int maxProfit = 0;
            int profit = prices[0];

            for (int i = 0; i < prices.length; i++) {
                if (prices[i] >= profit) {
                    maxProfit += (prices[i] - profit);
                }
                profit = prices[i];
            }

            return maxProfit;
        }

    }

}
