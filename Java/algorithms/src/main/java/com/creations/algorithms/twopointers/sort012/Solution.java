package com.creations.algorithms.twopointers.sort012;

/**
 * Problem: Sort array which only contains 0, 1, 2 without actually sorting the array.
 *
 * <p>Approach: We need to perform multiple steps till certain conditions are valid, and only 1 step
 * needs to be performed per iteration.
 *
 * <p>Maintaining 3 idx pointers will be required. One from currIdx, second for the index right
 * after last 0 already in the sorted pos, and third for the index right before first 2 already in
 * the sorted pos.
 *
 * <p>The idea is to continuously place 0 and 2 at their sorted pos and in the end only 1s will
 * remain in the middle and the array will be sorted.
 *
 * <p>TC: O(n); SC: O(1)
 */
public class Solution {
  public void sortColors(int[] nums) {
    int i = 0, j = nums.length - 1;
    int k = 0;
    while (k <= j && i <= j) {
      if (nums[i] == 0) {
        i++;
        k = i;
      } else if (nums[j] == 2) {
        j--;
      } else if (nums[k] == 0) {
        swap(nums, i, k);
        i++;
      } else if (nums[k] == 2) {
        swap(nums, j, k);
        j--;
      } else {
        k++;
      }
    }
  }

  private void swap(int[] nums, int x, int y) {
    int temp = nums[x];
    nums[x] = nums[y];
    nums[y] = temp;
  }
}
