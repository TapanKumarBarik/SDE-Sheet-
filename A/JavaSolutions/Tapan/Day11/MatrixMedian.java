public class MatrixMedian {
    public static void main(String[] args) {

    }

    // https://www.codingninjas.com/codestudio/problems/873378
    public static int getMedian(ArrayList<ArrayList<Integer>> matrix) {
        // Write your code here.

        ArrayList<Integer> arr = new ArrayList();

        for (int i = 0; i < matrix.size(); i++) {

            for (int j = 0; j < matrix.get(i).size(); j++) {
                arr.add(matrix.get(i).get(j));
            }
        }

        Collections.sort(arr);

        int n = arr.size();
        return arr.get(n / 2);
    }

    // Approach 2

    // binary search

    // https://www.interviewbit.com/problems/matrix-median/

    public int findMedian(ArrayList<ArrayList<Integer>> matrix) {
        ArrayList<Integer> arr = new ArrayList();

        for (int i = 0; i < matrix.size(); i++) {

            for (int j = 0; j < matrix.get(i).size(); j++) {
                arr.add(matrix.get(i).get(j));
            }
        }

        Collections.sort(arr);

        int n = arr.size();
        return arr.get(n / 2);
    }
}
