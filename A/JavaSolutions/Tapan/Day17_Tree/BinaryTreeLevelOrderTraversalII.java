public class BinaryTreeLevelOrderTraversalII {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> list = new ArrayList();
        if (root == null)
            return list;
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

        List<List<Integer>> newList = new ArrayList();

        for (int i = list.size() - 1; i >= 0; i--) {

            newList.add(list.get(i));
        }
        return newList;

    }
}
