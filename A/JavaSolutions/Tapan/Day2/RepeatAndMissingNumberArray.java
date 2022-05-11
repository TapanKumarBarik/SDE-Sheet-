public class RepeatAndMissingNumberArray {
    public static void main(String[] args) {

    }

    // https://www.interviewbit.com/problems/repeat-and-missing-number-array/
    public int[] repeatedNumber(final int[] A) {

        int n = A.length;
        int xor = 0;

        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        for (int i = 0; i < n; i++) {
            xor ^= A[i];
        }

        // lsb
        int rmsb = xor & -xor;

        int f = 0;
        int s = 0;

        for (int i = 0; i < n; i++) {

            if ((A[i] & rmsb) == 0) {
                f ^= A[i];
            } else {
                s ^= A[i];
            }
        }

        for (int i = 1; i <= n; i++) {

            if ((i & rmsb) == 0) {
                f ^= i;
            } else {
                s ^= i;
            }
        }

        //

        int[] arr = new int[2];

        for (int i = 0; i < A.length; i++) {

            if (A[i] == f || A[i] == s) {

                arr[0] = A[i];
                break;
            }
        }
        if (arr[0] == f) {
            arr[1] = s;
        } else if (arr[0] == s) {
            arr[1] = f;
        }
        return arr;

    }
    // https://www.codingninjas.com/codestudio/problems/873366?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website
}
