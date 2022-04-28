package Day1;

//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int curr = 0;
        for (int i = 0; i < n; i++) {

            curr += nums[i];

            max = Math.max(curr, max);

            if (curr < 0) {
                curr = 0;
            }
        }
        return max;

    }
}
