package Day1;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 */

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> arr = new ArrayList();
        if (numRows == 0)
            return arr;

        for (int i = 0; i < numRows; i++) {

            List<Integer> ar = new ArrayList();

            for (int j = 0; j <= i; j++) {

                if (i == 0 || j == 0 || i == j) {
                    ar.add(1);
                } else {

                    ar.add(arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1));
                }
            }
            arr.add(ar);

        }

        return arr;

    }
}