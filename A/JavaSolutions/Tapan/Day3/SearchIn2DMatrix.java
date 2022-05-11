public class SearchIn2DMatrix {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/search-a-2d-matrix/

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;

        int n = matrix[0].length;

        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {

            if (matrix[i][j] == target) {
                return true;

            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    // https://www.codingninjas.com/codestudio/problems/980531
    static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
        // Write your code here.

        n = mat.size();

        int i = 0;
        int j = mat.get(0).size() - 1;

        while (i < n && j >= 0) {

            if (mat.get(i).get(j) == target) {
                return true;
            } else if (mat.get(i).get(j) > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
