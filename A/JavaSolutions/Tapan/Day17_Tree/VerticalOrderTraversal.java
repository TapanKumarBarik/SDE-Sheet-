public class VerticalOrderTraversal {
    public static void main(String[] args) {

    }

    /**
     * Definition for binary tree
     * class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) {
     * val = x;
     * left=null;
     * right=null;
     * }
     * }
     */

    class pair {
        TreeNode node;
        int dist;

        public pair(TreeNode node, int dist) {
            this.node = node;
            this.dist = dist;
        }

    }

    class Solution {

        ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {

            ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
            HashMap<Integer, ArrayList<Integer>> map = new HashMap();

            Queue<pair> q = new LinkedList();
            map.put(0, new ArrayList());
            map.get(0).add(A.val);

            pair p = new pair(A, 0);
            q.add(p);

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            while (!q.isEmpty()) {

                TreeNode tempt = q.peek().node;
                int tempval = q.peek().dist;

                int len = q.size();
                q.remove();

                min = Math.min(tempval, min);
                max = Math.max(tempval, max);

                // 1
                // going one by one

                if (tempt.left != null) {

                    if (map.containsKey(tempval - 1)) {

                        ArrayList<Integer> temporaryArray = map.get(tempval - 1);
                        temporaryArray.add(tempt.left.val);
                        map.put(tempval - 1, temporaryArray);
                    } else {

                        map.put(tempval - 1, new ArrayList());
                        map.get(tempval - 1).add(tempt.left.val);
                    }

                    pair tempp = new pair(tempt.left, tempval - 1);
                    q.add(tempp);

                }

                if (tempt.right != null) {

                    if (map.containsKey(tempval + 1)) {

                        ArrayList<Integer> temporaryArray = map.get(tempval + 1);
                        temporaryArray.add(tempt.right.val);
                        map.put(tempval + 1, temporaryArray);
                    } else {
                        map.put(tempval + 1, new ArrayList());
                        map.get(tempval + 1).add(tempt.right.val);
                    }
                    pair tempp = new pair(tempt.right, tempval + 1);
                    q.add(tempp);

                }
            }

            // return result
            for (int i = min; i <= max; i++) {

                arr.add(map.get(i));
            }

            return arr;

        }
    }
}
