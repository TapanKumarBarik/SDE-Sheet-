public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/longest-consecutive-sequence/

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int count = 1;
                int curr = nums[i];
                while (set.contains(curr + 1)) {
                    count++;
                    curr++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    // https://www.codingninjas.com/codestudio/problems/759408

    public static int lengthOfLongestConsecutiveSequence(int[] nums, int N) {
        // Write your code here.
        HashSet<Integer> set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int count = 1;
                int curr = nums[i];
                while (set.contains(curr + 1)) {
                    count++;
                    curr++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
