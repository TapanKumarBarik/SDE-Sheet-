public class BoundaryTraversalofBinaryTree {
    public static void main(String[] args) {

    }
    // https://www.codingninjas.com/codestudio/problems/boundary-traversal_790725

    /************************************************************
     * 
     * Following is the Binary Tree node structure:
     * 
     * class TreeNode {
     * int data;
     * TreeNode left;
     * TreeNode right;
     * 
     * TreeNode(int data) {
     * this.data = data;
     * this.left = null;
     * this.right = null;
     * }
     * 
     * }
     * 
     ************************************************************/

    public static ArrayList<Integer> traverseBoundary(TreeNode root) {
        // Write your code here.
        ArrayList<Integer> arr = new ArrayList();

        if (root == null)
            return arr;
        if (!isLeaf(root)) {
            arr.add(root.data);
        }
        leftOrderTraversal(root, arr);
        bottomOrderTraversal(root, arr);
        rightOrderTraversal(root, arr);
        return arr;
    }

    private static boolean isLeaf(TreeNode root) {

        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }

    private static void bottomOrderTraversal(TreeNode root, ArrayList<Integer> arr) {

        if (isLeaf(root)) {
            arr.add(root.data);
            return;
        }
        if (root.left != null) {
            bottomOrderTraversal(root.left, arr);
        }
        if (root.right != null) {
            bottomOrderTraversal(root.right, arr);
        }
    }

    private static void rightOrderTraversal(TreeNode root, ArrayList<Integer> arr) {

        TreeNode curr = root.right;
        ArrayList<Integer> arr1 = new ArrayList();

        while (curr != null) {
            if (!isLeaf(curr)) {
                arr1.add(curr.data);
            }
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        for (int i = arr1.size() - 1; i >= 0; i--) {
            arr.add(arr1.get(i));
        }
    }

    private static void leftOrderTraversal(TreeNode root, ArrayList<Integer> arr) {

        TreeNode curr = root.left;

        while (curr != null) {
            if (!isLeaf(curr)) {
                arr.add(curr.data);
            }
            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }
}
