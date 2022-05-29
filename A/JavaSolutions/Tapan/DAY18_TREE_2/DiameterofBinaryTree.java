public class DiameterofBinaryTree {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/diameter-of-binary-tree/

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;
        int[] arr = new int[1];
        solve(arr, root);
        return arr[0];

    }

    private int solve(int[] arr, TreeNode root) {

        if (root == null)
            return 0;
        int lh = solve(arr, root.left);
        int rh = solve(arr, root.right);
        arr[0] = Math.max(arr[0], lh + rh);

        return 1 + Math.max(lh, rh);
    }

    // https://www.codingninjas.com/codestudio/problems/920552

    public static int diameterOfBinaryTree(TreeNode<Integer> root) {
        // Write your code here.

        if (root == null)
            return 0;

        int[] arr = new int[1];

        solve(arr, root);

        return arr[0];
    }

    private static int solve(int[] arr, TreeNode<Integer> root) {
        if (root == null)
            return 0;

        int lh = solve(arr, root.left);
        int rh = solve(arr, root.right);

        arr[0] = Math.max(arr[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
