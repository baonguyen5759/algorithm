package com.bao.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 121. Best Time to Buy and Sell Stock
 * ou are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 *
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 */

@Slf4j
public class Prop121 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int price: prices) {
            maxProfit = Math.max(maxProfit, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }

        return maxProfit;
    }

    void main() {
        int[] prices1 = {7,1,5,3,6,4};
        int output1 = maxProfit(prices1);
        log.info("Output 1: {} | Array: {}", output1, Arrays.toString(prices1));

        int[] prices2 = {7,6,4,3,1};
        int output2 = maxProfit(prices2);
        log.info("Output 1: {} | Array: {}", output2, Arrays.toString(prices2));
    }
}
