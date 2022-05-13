public class MajorityElement {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/majority-element/

    public int majorityElement(int[] nums) {
        int vote = 1;
        int curr = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (vote == 0) {
                curr = nums[i];
            }
            if (curr == nums[i]) {
                vote++;
            } else {
                vote--;
            }
        }
        return curr;
    }

    // https://www.codingninjas.com/codestudio/problems/842495
    public static int findMajority(int[] arr, int n) {
        // Write your code here.

        int vote = 1;
        int curr = arr[0];

        for (int i = 0; i < n; i++) {

            if (vote == 0) {
                curr = arr[i];
            }
            if (curr == arr[i]) {
                vote++;
            } else {
                vote--;
            }
        }

        // check
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == curr) {
                count++;
            }
        }

        if (count > n / 2)
            return curr;
        return -1;
    }
}
