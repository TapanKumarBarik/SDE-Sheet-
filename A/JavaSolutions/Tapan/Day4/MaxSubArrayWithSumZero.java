import java.util.*;

public class MaxSubArrayWithSumZero {
    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int n = 8;

        System.out.println(maxLen(arr, n));
    }

    // https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
    private static int maxLen(int arr[], int n) {
        // Your code here

        int[] prefix = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            prefix[i] = sum;
        }

        System.out.println();
        HashMap<Integer, Integer> map = new HashMap();

        int res = 0;

        for (int i = 0; i < n; i++) {

            int curr = prefix[i];

            if (curr == 0) {
                res = i + 1;
            }
            if (map.containsKey(curr)) {

                res = Math.max(res, i - map.get(curr));
            }

            if (!map.containsKey(curr)) {
                map.put(curr, i);
            }
        }
        return res;
    }

    // https://www.codingninjas.com/codestudio/problems/920321
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

        // Write your code here.
        int n = arr.size();
        int[] prefix = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
            prefix[i] = sum;
        }

        System.out.println();
        HashMap<Integer, Integer> map = new HashMap();

        int res = 0;

        for (int i = 0; i < n; i++) {

            int curr = prefix[i];

            if (curr == 0) {
                res = i + 1;
            }
            if (map.containsKey(curr)) {

                res = Math.max(res, i - map.get(curr));
            }

            if (!map.containsKey(curr)) {
                map.put(curr, i);
            }
        }
        return res;
    }
}