public class PasCalTriangle {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/pascals-triangle/
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> arr = new ArrayList();

        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList();

            for (int j = 0; j <= i; j++) {

                if (i == 0 || j == 0 || i == j) {
                    temp.add(1);
                } else {
                    temp.add(arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1));
                }
            }
            arr.add(temp);
        }
        return arr;
    }

    // https://www.codingninjas.com/codestudio/problems/1089580?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0

    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
        ArrayList<ArrayList<Long>> arr = new ArrayList();

        for (int i = 0; i < n; i++) {
            ArrayList<Long> temp = new ArrayList();

            for (int j = 0; j <= i; j++) {

                if (i == 0 || j == 0 || i == j) {
                    temp.add((long) 1);
                } else {
                    temp.add(arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1));
                }
            }
            arr.add(temp);
        }
        return arr;
    }
}
