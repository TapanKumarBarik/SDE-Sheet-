public class MergeOverLappingSubintervals {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/merge-intervals/

    public int[][] merge(int[][] intervals) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int first = intervals[0][0];

        int second = intervals[0][1];

        int n = intervals.length;

        for (int i = 1; i < n; i++) {

            if (intervals[i][0] <= second) {

                second = Math.max(second, intervals[i][1]);
            }

            else {
                ArrayList<Integer> temp = new ArrayList();
                temp.add(first);
                temp.add(second);
                arr.add(temp);
                first = intervals[i][0];
                second = intervals[i][1];
            }
        }
        ArrayList<Integer> temp = new ArrayList();
        temp.add(first);
        temp.add(second);
        arr.add(temp);

        //
        int[][] res = new int[arr.size()][2];

        for (int i = 0; i < arr.size(); i++) {
            res[i][0] = arr.get(i).get(0);
            res[i][1] = arr.get(i).get(1);
        }
        return res;

    }

    // https://www.codingninjas.com/codestudio/problems/699917?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website
}
