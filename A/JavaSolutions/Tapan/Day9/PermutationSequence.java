public class PermutationSequence {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/permutation-sequence/

    public String getPermutation(int n, int k) {

        int fact = 1;
        ArrayList<Integer> arr = new ArrayList();

        for (int i = 1; i < n; i++) {
            fact = fact * i;
            arr.add(i);
        }
        arr.add(n);

        String res = "";
        k = k - 1;
        while (true) {
            int l1 = k / fact;
            int l2 = k % fact;
            res += arr.get(l1);
            arr.remove(l1);
            k = l2;
            if (arr.size() == 0) {
                break;
            }
            fact = fact / arr.size();

        }
        return res;
    }

    // https://www.codingninjas.com/codestudio/problems/1112626

    public static String kthPermutation(int n, int k) {
        // Write your code here.

        int fact = 1;
        ArrayList<Integer> arr = new ArrayList();

        for (int i = 1; i < n; i++) {
            fact = fact * i;
            arr.add(i);
        }
        arr.add(n);

        String res = "";
        k = k - 1;
        while (true) {
            int l1 = k / fact;
            int l2 = k % fact;
            res += arr.get(l1);
            arr.remove(l1);
            k = l2;
            if (arr.size() == 0) {
                break;
            }
            fact = fact / arr.size();

        }
        return res;
    }
}
