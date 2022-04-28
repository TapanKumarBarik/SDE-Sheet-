package com.creations.algorithms.dp.maxsubarraysum;

/**
 * Problem: Max subarray sum
 *
 * <p>Approach: We can keep 2 running variables which will store the overall max sum and curr sum.
 *
 * <p>On getting every integer, curr sum will be incremented.
 *
 * <p>If curr sum went beyond max sum, max sum will be updated to curr sum.
 *
 * <p>If curr sum went below 0, curr sum will be set to 0 as a subarray will negative sum will only
 * diminish the value of next sums.
 */
public class Solution {
  public int maxSubArray(int[] nums) {
    int ans = Integer.MIN_VALUE, curr = 0;
    for (int i : nums) {
      curr += i;
      if (curr > ans) {
        ans = curr;
      }
      if (curr < 0) {
        curr = 0;
      }
    }
    return ans;
  }
}
