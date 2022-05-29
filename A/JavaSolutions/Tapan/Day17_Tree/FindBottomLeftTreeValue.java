public class FindBottomLeftTreeValue {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/find-bottom-left-tree-value/

    public int findBottomLeftValue(TreeNode root) {

        List<List<Integer>> list = new ArrayList();

        Queue<TreeNode> q = new LinkedList();

        if (root == null)
            return 0;

        q.offer(root);

        while (!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> temp = new ArrayList();

            for (int i = 0; i < n; i++) {

                TreeNode curr = q.poll();

                temp.add(curr.val);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            list.add(temp);
        }

        return list.get(list.size() - 1).get(0);

    }
}
