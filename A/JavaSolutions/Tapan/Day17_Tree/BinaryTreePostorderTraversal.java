public class BinaryTreePostorderTraversal {
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
    // https://leetcode.com/problems/binary-tree-postorder-traversal/

    // RECURSIVE

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList();

        solve(list, root);

        return list;
    }

    private void solve(List<Integer> list, TreeNode root) {

        if (root == null) {
            return;
        }
        solve(list, root.left);
        solve(list, root.right);
        list.add(root.val);

    }

    // ITERATIVE

    public List<Integer> postorderTraversal(TreeNode root) {

        LinkedList<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return ans;

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            ans.addFirst(cur.val);
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        return ans;
    }

    /*
     * List<Integer>list=new ArrayList();
     * 
     * solve(list, root);
     * 
     * return list;
     * }
     * private void solve(List<Integer>list, TreeNode root){
     * 
     * if(root==null){
     * return;
     * }
     * solve(list, root.left);
     * solve(list, root.right);
     * list.add(root.val);
     * 
     * }
     */

}
