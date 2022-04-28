package com.creations.algorithms.matrix.setMatrixZeroes;

import java.util.Arrays;

/**
 * Problem: 73. Set Matrix Zeroes
 *
 * <p>URL: https://leetcode.com/problems/set-matrix-zeroes/
 *
 * <p>Approaches
 *
 * <p>1. Brute force: Use two arrays, one for rows and other for cols.
 *
 * <p>These rows will be used to notify that any element in the matrix at the specific row or col is
 * a 0.
 *
 * <p>Once the arrays are prepared, another traversal over the matrix and mark a cell as 0 of the
 * row or col is marked as 0.
 *
 * <p>TC: O(n^2); SC: O(n)
 *
 * <p>2. In-place: The intention is to remove the 2 arrays used in the earlier approach.
 *
 * <p>The first row and first col will be used to serve as the notifier.
 *
 * <p>2.1. Keep 2 booleans to notify if the first row and first col has a 0 in the beginning itself.
 *
 * <p>2.2. Traverse the matrix and mark first row and first col of any cell as 0 if the cell is 0.
 *
 * <p>2.3. Traverse the matrix except the first row and first col, mark cell as 0 of corresponding
 * first row or col is 0.
 *
 * <p>2.4. If the first row boolean from the beginning is true, mark the entire first row as 0.
 *
 * <p>2.5. If the first col boolean from the beginning is true, mark the entire first col as 0.
 *
 * <p>TC: O(n^2); SC: O(1)
 */
class Solution {

  public void setZeroes(int[][] matrix) {
    boolean firstRowHasZero = isZeroPresentInFirstRow(matrix);
    boolean firstColHasZero = isZeroPresentInFirstCol(matrix);
    setFirstRowColToZero(matrix);
    setInternalCellsToZero(matrix);
    if (firstRowHasZero) {
      setFirstRowToZero(matrix);
    }
    if (firstColHasZero) {
      setFirstColToZero(matrix);
    }
  }

  private boolean isZeroPresentInFirstRow(int[][] matrix) {
    for (int i = 0; i < matrix[0].length; i++) {
      if (matrix[0][i] == 0) {
        return true;
      }
    }
    return false;
  }

  private boolean isZeroPresentInFirstCol(int[][] matrix) {
    for (int[] row : matrix) {
      if (row[0] == 0) {
        return true;
      }
    }
    return false;
  }

  private void setFirstRowColToZero(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }
  }

  private void setInternalCellsToZero(int[][] matrix) {
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[i].length; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
  }

  private void setFirstRowToZero(int[][] matrix) {
    Arrays.fill(matrix[0], 0);
  }

  private void setFirstColToZero(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][0] = 0;
    }
  }
}
