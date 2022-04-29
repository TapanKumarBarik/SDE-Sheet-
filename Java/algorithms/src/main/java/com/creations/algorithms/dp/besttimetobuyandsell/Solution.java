package com.creations.algorithms.dp.besttimetobuyandsell;

/**
 * Problem: 121. Best Time to Buy and Sell Stock
 *
 * <p>Approach: A person will make profit if any of the previous days has a lesser value. The profit
 * will be maximized the more the lesser value is minimized.
 *
 * <p>If we can track the minimum value till curr index and if its less than curr value, we get a
 * candidate solution for max profit that could be made.
 *
 * <p>The max of all possible candidate profit will be the overall max profit.
 *
 * <p>TC: O(n); SC: O(1)
 */
public class Solution {
  public int maxProfit(int[] prices) {
    int minPrice = prices[0];
    int maxProfit = 0;
    for (int price : prices) {
      if (price > minPrice) {
        maxProfit = Math.max(maxProfit, price - minPrice);
      }
      if (price < minPrice) {
        minPrice = price;
      }
    }
    return maxProfit;
  }
}
