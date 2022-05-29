public class SameTree {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/same-tree/

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null || q == null) {
            return p == q;
        }

        return (p.val == q.val) &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }

    // https://www.codingninjas.com/codestudio/problems/799364

    public static boolean identicalTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        // Write you code here.
        if (root1 == null || root2 == null) {
            return (root1 == root2);
        }

        return (root1.data == root2.data) &&
                identicalTrees(root1.left, root2.left) &&
                identicalTrees(root1.right, root2.right);
    }
}
