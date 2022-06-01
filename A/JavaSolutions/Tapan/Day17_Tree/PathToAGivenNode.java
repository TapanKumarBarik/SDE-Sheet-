public class PathToAGivenNode {
    public static void main(String[] args) {

    }
    // https://www.interviewbit.com/problems/path-to-given-node/

    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> arr = new ArrayList();
        solve1(A, B, arr);
        return arr;
    }

    private boolean solve1(TreeNode A, int B, ArrayList<Integer> arr) {
        if (A == null) {
            return false;
        }
        arr.add(A.val);
        if (A.val == B) {
            return true;
        }
        if (solve1(A.left, B, arr) || solve1(A.right, B, arr)) {
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;
    }
}
