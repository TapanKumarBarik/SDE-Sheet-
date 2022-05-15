public class TwoSum {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/two-sum/

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap();
        int[] arr = new int[2];

        int n = nums.length;
        for (int i = 0; i < n; i++) {

            int curr = nums[i];

            int req = target - curr;

            if (map.containsKey(req)) {

                arr[0] = i;
                arr[1] = map.get(req);
                break;
            }

            map.put(curr, i);
        }
        return arr;
    }

    // https://www.codingninjas.com/codestudio/problems/pair-sum_697295

    public static int[][] pairSum(int[] arr, int s) {

        ArrayList<ArrayList<Integer>> list = new ArrayList();
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == s) {
                    ArrayList<Integer> temp = new ArrayList();
                    temp.add(Math.min(arr[i], arr[j]));
                    temp.add(Math.max(arr[i], arr[j]));
                    list.add(temp);
                }
            }
        }
        int[][] arrr = new int[list.size()][2];
        for (int i = 0; i < arrr.length; i++) {
            arrr[i][0] = list.get(i).get(0);
            arrr[i][1] = list.get(i).get(1);
        }

        Arrays.sort(arrr, (a, b) -> Integer.compare(a[0], b[0]));
        return arrr;
    }
}
