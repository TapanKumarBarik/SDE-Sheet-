public class Subsets2 {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/subsets-ii/

    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {

            List<List<Integer>> list = new ArrayList();
            Arrays.sort(nums);
            solve(0, list, new ArrayList(), nums);

            return list;
        }

        private void solve(int start, List<List<Integer>> list, ArrayList<Integer> temp, int[] nums) {

            list.add(new ArrayList(temp));

            for (int i = start; i < nums.length; i++) {

                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }

                temp.add(nums[i]);
                solve(i + 1, list, temp, nums);

                temp.remove(temp.get(temp.size() - 1));
            }

        }
    }

    // https://www.codingninjas.com/codestudio/problems/unique-subsets_3625236
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        int start = 0;
        solve(list, new ArrayList(), arr, n, start);

        return list;
    }

    private static void solve(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp, int[] arr,
            int n, int start) {

        list.add(new ArrayList(temp));

        for (int i = start; i < n; i++) {

            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            temp.add(arr[i]);
            solve(list, temp, arr, n, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
