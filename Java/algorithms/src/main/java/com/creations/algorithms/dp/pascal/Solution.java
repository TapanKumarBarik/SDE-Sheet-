package com.creations.algorithms.dp.pascal;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: 118. Pascal's Triangle
 *
 * <p>URL: https://leetcode.com/problems/pascals-triangle/
 *
 * <p>Approaches
 *
 * <p>Each row can be built in a separate iteration.
 *
 * <p>The first item is added for each row, that means, 1 will be added in each row.
 *
 * <p>The last 1 is to be added only from the second row.
 *
 * <p>The middle elements are to be added only from the third row and will be the sum of 2 elements
 * from the previous row which are same index and the prev index.
 *
 * <p>TC: O(n^2); SC: O(n^2)
 */
class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      List<Integer> curr = new ArrayList<>();
      curr.add(1);
      for (int j = 1; j < i; j++) {
        curr.add(res.get(i - 1).get(j) + res.get(i - 1).get(j - 1));
      }
      if (i > 0) {
        curr.add(1);
      }
      res.add(curr);
    }
    return res;
  }
}
