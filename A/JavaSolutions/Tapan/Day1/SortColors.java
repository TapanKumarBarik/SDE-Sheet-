public class SortColors {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/sort-colors/
    public void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        //

        for (int i = 0; i < zero; i++) {

            nums[i] = 0;
        }

        for (int i = zero; i < zero + one; i++) {
            nums[i] = 1;
        }

        for (int i = zero + one; i < n; i++) {
            nums[i] = 2;
        }

    }

    // https://www.codingninjas.com/codestudio/problems/631055?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0
    public static void sort012(int[] arr) {
        // Write your code here

        int n = arr.length;
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else {
                two++;
            }
        }
        //
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < zero + one; i++) {
            arr[i] = 1;
        }
        for (int i = zero + one; i < n; i++) {
            arr[i] = 2;
        }
    }
}
