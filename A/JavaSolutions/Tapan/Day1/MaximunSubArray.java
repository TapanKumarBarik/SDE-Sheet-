public class MaximunSubArray {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/maximum-subarray/
    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }

        }
        return max;

    }

    // https://www.codingninjas.com/codestudio/problems/630526
    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here

        long max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

}
