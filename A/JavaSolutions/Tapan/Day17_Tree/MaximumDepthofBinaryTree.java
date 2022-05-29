public class MaximumDepthofBinaryTree {
    public static void main(String[] args) {

    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    // https://leetcode.com/problems/maximum-depth-of-binary-tree/

    // ITERATIVE

    public int maxDepth(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);

        while (!q.isEmpty()) {
            List<Integer> arr = new ArrayList();
            int n = q.size();
            for (int i = 0; i < n; i++) {

                TreeNode temp = q.poll();
                arr.add(temp.val);

                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }

            }

            list.add(arr);
        }

        return list.size();
    }

    // 2

    public int maxDepth(TreeNode root) {

        int depth = 0;
        if (root == null)
            return depth;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            depth++;
            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
        }
        return depth;
    }

    // RECURSION
    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        int left = maxDepth(root.left);

        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);

        /*
         * int depth=0;
         * if (root == null)
         * return depth;
         * Queue<TreeNode> q = new LinkedList();
         * q.offer(root);
         * while (!q.isEmpty()) {
         * int n = q.size();
         * depth++;
         * for (int i = 0; i < n; i++) {
         * TreeNode temp = q.poll();
         * if (temp.left != null) {
         * q.offer(temp.left);
         * }
         * if (temp.right != null) {
         * q.offer(temp.right);
         * }
         * }
         * }
         * return depth;
         */
    }
}
