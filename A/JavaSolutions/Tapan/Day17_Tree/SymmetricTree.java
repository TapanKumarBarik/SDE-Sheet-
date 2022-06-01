public class SymmetricTree {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/symmetric-tree/

    public boolean isSymmetric(TreeNode root) {

        if (root == null)
            return true;
        return isSymmetrical(root.left, root.right);

    }

    private boolean isSymmetrical(TreeNode left, TreeNode right) {

        if (left == null || right == null) {
            return left == right;
        }

        if (left.val != right.val)
            return false;

        return isSymmetrical(left.left, right.right) &&
                isSymmetrical(left.right, right.left);
    }
}
