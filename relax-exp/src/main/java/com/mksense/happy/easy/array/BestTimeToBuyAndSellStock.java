package com.mksense.happy.easy.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Say you have an array for which the ith element is the price
 * of a given stock on day i.
 *
 * <p>If you were only permitted to complete at most one
 * transaction (i.e., buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 *
 * <p>Note that you cannot sell a stock before you buy one.
 *
 * <p>Example 1:
 *
 * <p>Input: [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1)
 * and sell on day 5 (price = 6), profit = 6-1 = 5. Not 7-1 = 6,
 * as selling price needs to be larger than buying price.
 * Example 2:
 *
 * <p>Input: [7,6,4,3,1] Output: 0 Explanation: In this case,
 * no transaction is done, i.e. max profit = 0.
 *
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-29
 */
public class BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}

		int maxProfit = 0;
		int tempProfit = 0;

		for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
	      tempProfit = prices[j] - prices[i];
    	  maxProfit = Math.max(maxProfit, tempProfit);
      }
    }

    return maxProfit > 0 ? maxProfit : 0;
	}

	public int maxProfit2(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}

		int maxProfit = 0;
		int minPrice = prices[0];

		for(int i = 0; i < prices.length; i++) {
			minPrice = Math.min(prices[i], minPrice);
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
		}

    return maxProfit > 0 ? maxProfit : 0;
	}
}
