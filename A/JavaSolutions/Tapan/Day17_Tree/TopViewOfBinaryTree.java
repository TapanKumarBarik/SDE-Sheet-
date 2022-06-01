
// https:// practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1

// https:// www.codingninjas.com/codestudio/problems/799401

/************************************************************

Following is the TreeNode class structure:

class BinaryTreeNode {
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;

	BinaryTreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

************************************************************/
import java.util.*;

class pair {
    BinaryTreeNode node;

    int data;

    public pair(BinaryTreeNode node, int data) {
        this.node = node;
        this.data = data;
    }
}

public class Solution {
    public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
        // Write your code here.

        ArrayList<Integer> arr = new ArrayList();
        if (root == null)
            return arr;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap();

        Queue<pair> q = new LinkedList();

        map.put(0, new ArrayList());
        map.get(0).add(root.val);

        pair p = new pair(root, 0);

        q.offer(p);

        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        while (!q.isEmpty()) {

            BinaryTreeNode temp = q.peek().node;

            int tempval = q.peek().data;

            min = Math.min(tempval, min);

            max = Math.max(max, tempval);

            q.remove();

            if (temp.left != null) {

                if (map.containsKey(tempval - 1)) {

                    ArrayList<Integer> temparr = map.get(tempval - 1);
                    temparr.add(temp.left.val);
                    map.put(tempval - 1, temparr);
                } else {
                    map.put(tempval - 1, new ArrayList());
                    map.get(tempval - 1).add(temp.left.val);
                }

                pair p1 = new pair(temp.left, tempval - 1);
                q.offer(p1);
            }

            if (temp.right != null) {
                if (map.containsKey(tempval + 1)) {

                    ArrayList<Integer> temparr = map.get(tempval + 1);
                    temparr.add(temp.right.val);
                    map.put(tempval + 1, temparr);
                } else {
                    map.put(tempval + 1, new ArrayList());
                    map.get(tempval + 1).add(temp.right.val);
                }

                pair p2 = new pair(temp.right, tempval + 1);
                q.offer(p2);

            }

        }

        for (int i = min; i <= max; i++) {

            if (map.get(i).size() > 0) {
                arr.add(map.get(i).get(0));
            }
        }
        return arr;

    }
}
