public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/binary-tree-maximum-path-sum/

    int max;

    public int maxPathSum(TreeNode root) {

        max = Integer.MIN_VALUE;

        if (root == null)
            return 0;

        solve(root);
        return max;

    }

    private int solve(TreeNode root) {

        if (root == null)
            return 0;

        int lh = Math.max(0, solve(root.left));

        int rh = Math.max(0, solve(root.right));

        max = Math.max(max, lh + rh + root.val);

        return root.val + Math.max(lh, rh);
    }

    // https://www.codingninjas.com/codestudio/problems/794950
}
