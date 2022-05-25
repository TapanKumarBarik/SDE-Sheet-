public class UniqueElementInSortedArray {
    public static void main(String[] args) {

    }
    // https://www.codingninjas.com/codestudio/problems/1112654

    public static int uniqueElement(ArrayList<Integer> arr) {
        // Write your code here.

        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        return xor;
    }
    // https://leetcode.com/problems/single-element-in-a-sorted-array/

    public int singleNonDuplicate(int[] nums) {

        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}
