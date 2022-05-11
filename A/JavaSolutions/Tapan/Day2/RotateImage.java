public class RotateImage {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/rotate-image/
    public void rotate(int[][] m) {

        int n = m.length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                swap(m, i, j);
            }

        }
        for (int i = 0; i < n; i++) {

            reverse(m, i, n - 1);
        }

    }

    private void reverse(int[][] m, int i, int n) {

        int j = 0;
        while (j < n) {
            // swap(m, i,n);
            int temp = m[i][j];
            m[i][j] = m[i][n];
            m[i][n] = temp;
            j++;
            n--;
        }
    }

    private void swap(int[][] m, int i, int j) {

        int temp = m[i][j];

        m[i][j] = m[j][i];
        m[j][i] = temp;
    }

    // https://www.codingninjas.com/codestudio/problems/981260?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website
}
