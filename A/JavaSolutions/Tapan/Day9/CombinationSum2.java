public class CombinationSum2 {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/combination-sum-ii/

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList();

        solve(list, new ArrayList(), nums, target, 0);

        return list;
    }

    private void solve(List<List<Integer>> list, ArrayList<Integer> temp,
            int[] nums, int target, int start) {

        if (target < 0) {
            return;
        } else if (target == 0) {
            list.add(new ArrayList(temp));
        } else {

            for (int i = start; i < nums.length; i++) {

                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                temp.add(nums[i]);
                solve(list, temp, nums, target - nums[i], i + 1);
                temp.remove(temp.size() - 1);
            }
        }

    }
    // https://www.codingninjas.com/codestudio/problems/1112622

    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        Collections.sort(arr);

        ArrayList<ArrayList<Integer>> list = new ArrayList();
        solve(list, new ArrayList(), arr, n, k, 0, 0);
        return list;
    }

    private static void solve(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp,
            ArrayList<Integer> arr, int n, int k, int start, int sum) {
        if (sum < 0)
            return;
        if (sum == k) {
            list.add(new ArrayList(temp));
        } else {
            for (int i = start; i < n; i++) {
                if (i > start && arr.get(i) == arr.get(i - 1)) {
                    continue;
                }
                temp.add(arr.get(i));
                solve(list, temp, arr, n, k, i + 1, sum + arr.get(i));
                temp.remove(temp.size() - 1);
            }
        }
    }
}
