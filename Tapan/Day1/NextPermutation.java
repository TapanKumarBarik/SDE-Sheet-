package Day1;

//https://leetcode.com/problems/next-permutation/
import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {

        // first we have to find the decresing index
        // if i>=0
        // then find the index just greater than the decreasing index

        // swap i , j
        // reverse i+1 to n-1;

        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;

        }
        int j = n - 1;

        if (i >= 0) {
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
    }

    private void reverse(int[] nums, int i, int j) {

        while (i <= j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
