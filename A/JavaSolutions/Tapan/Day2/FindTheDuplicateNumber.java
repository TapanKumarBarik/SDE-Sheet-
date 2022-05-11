public class FindTheDuplicateNumber {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/find-the-duplicate-number/
    public int findDuplicate(int[] nums) {

        int fast = 0;
        int slow = 0;

        do {
            fast = nums[nums[fast]];
            slow = nums[slow];
        } while (fast != slow);

        slow = 0;

        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;

    }
    // https://www.codingninjas.com/codestudio/problems/1112602?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int fast = 0;
        int slow = 0;
        do {
            fast = arr.get(arr.get(fast));
            slow = arr.get(slow);
        } while (fast != slow);
        fast = 0;
        while (fast != slow) {
            slow = arr.get(slow);
            fast = arr.get(fast);
        }
        return slow;
    }
}
