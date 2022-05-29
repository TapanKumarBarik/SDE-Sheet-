public class LeftViewOfaBinaryTree {
    public static void main(String[] args) {

    }
    // https://www.codingninjas.com/codestudio/problems/920519

    /************************************************************
     * 
     * Following is the TreeNode class structure
     * 
     * class TreeNode<T>
     * {
     * public:
     * T data;
     * TreeNode<T> left;
     * TreeNode<T> right;
     * 
     * TreeNode(T data)
     * {
     * this.data = data;
     * left = null;
     * right = null;
     * }
     * };
     * 
     ************************************************************/
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) {
        // Write your code here.

        ArrayList<Integer> res = new ArrayList();
        if (root == null)
            return res;
        ArrayList<ArrayList<Integer>> list = new ArrayList();

        Queue<TreeNode<Integer>> q = new LinkedList();
        q.offer(root);

        while (!q.isEmpty()) {

            int n = q.size();
            ArrayList<Integer> temp = new ArrayList();

            for (int i = 0; i < n; i++) {

                TreeNode<Integer> curr = q.poll();

                temp.add(curr.data);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            list.add(temp);

        }

        for (int i = 0; i < list.size(); i++) {
            res.add(list.get(i).get(0));
        }
        return res;

    }

    // https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

    ArrayList<Integer> leftView(Node root) {
        // Your code here

        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null)
            return res;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);

        while (!q.isEmpty()) {

            int n = q.size();
            ArrayList<Integer> temp = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {

                Node curr = q.poll();

                temp.add(curr.data);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            list.add(temp);

        }

        for (int i = 0; i < list.size(); i++) {
            res.add(list.get(i).get(0));
        }
        return res;

    }
}
