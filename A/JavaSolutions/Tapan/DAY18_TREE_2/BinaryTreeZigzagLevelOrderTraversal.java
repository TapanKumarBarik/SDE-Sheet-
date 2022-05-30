public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList();

        if (root == null)
            return list;

        Queue<TreeNode> q = new LinkedList();

        q.offer(root);
        boolean flag = true;

        while (!q.isEmpty()) {

            int n = q.size();

            List<Integer> temp = new ArrayList();

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

            if (flag) {
                list.add(temp);
            } else {
                reverse(temp);
                list.add(temp);
            }
            flag = !flag;
        }

        return list;

    }

    private void reverse(List<Integer> arr) {

        int i = 0;
        int n = arr.size() - 1;

        while (i < n) {

            int temp = arr.get(i);
            arr.set(i, arr.get(n));
            arr.set(n, temp);
            i++;
            n--;
        }
    }

    // https://www.codingninjas.com/codestudio/problems/1062662

    public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here!
        List<List<Integer>> list = new ArrayList();
        List<Integer> res = new ArrayList();
        if (root == null)
            return res;

        Queue<BinaryTreeNode<Integer>> q = new LinkedList();

        q.offer(root);
        boolean flag = true;

        while (!q.isEmpty()) {

            int n = q.size();

            List<Integer> temp = new ArrayList();

            for (int i = 0; i < n; i++) {

                BinaryTreeNode<Integer> curr = q.poll();

                temp.add(curr.data);

                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            if (flag) {
                list.add(temp);
            } else {
                reverse(temp);
                list.add(temp);
            }
            flag = !flag;
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                res.add(list.get(i).get(j));
            }
        }
        return res;

    }

    private static void reverse(List<Integer> arr) {

        int i = 0;
        int n = arr.size() - 1;

        while (i < n) {

            int temp = arr.get(i);
            arr.set(i, arr.get(n));
            arr.set(n, temp);
            i++;
            n--;
        }
    }
}
