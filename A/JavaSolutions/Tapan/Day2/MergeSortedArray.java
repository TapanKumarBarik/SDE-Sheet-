public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int num2 = { 2, 5, 6 };

    }

    // https://leetcode.com/problems/merge-sorted-array/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        m--;
        n--;
        while (n >= 0) {

            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[index] = nums1[m];
                m--;
                index--;
            } else {
                nums1[index] = nums2[n];
                n--;
                index--;
            }
        }
    }

    // https://www.codingninjas.com/codestudio/problems/1214628?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.

        int index = m + n - 1;
        m--;
        n--;

        while (n >= 0) {

            if (m >= 0 && arr1[m] > arr2[n]) {

                arr1[index] = arr1[m];
                m--;
                index--;
            } else {
                arr1[index] = arr2[n];
                n--;
                index--;
            }
        }
        return arr1;
    }

}
