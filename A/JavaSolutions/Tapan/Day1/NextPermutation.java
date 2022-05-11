public class NextPermutation {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/next-permutation/

    public void nextPermutation(int[] nums) {

        // find the next decreasing subsequence

        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {

            // find the number just greater than nums[i]
            int j = n - 1;

            while (j >= 0 && nums[j] <= nums[i]) {
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

    // www.codingninjas.com/codestudio/problems/893046

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> p) {
        // Write your code here.

        int n = p.size();

        int i = n - 2;

        while (i >= 0 && p.get(i) >= p.get(i + 1)) {
            i--;
        }

        if (i >= 0) {

            int j = n - 1;

            while (j >= 0 && p.get(i) >= p.get(j)) {
                j--;
            }
            swap(p, i, j);
        }
        reverse(p, i + 1, n - 1);

        return p;
    }

    private static void swap(ArrayList<Integer> p, int i, int j) {
        int temp = p.get(i);
        p.set(i, p.get(j));
        p.set(j, temp);
    }

    private static void reverse(ArrayList<Integer> p, int i, int j) {

        while (i < j) {
            swap(p, i, j);
            i++;
            j--;
        }
    }

}
