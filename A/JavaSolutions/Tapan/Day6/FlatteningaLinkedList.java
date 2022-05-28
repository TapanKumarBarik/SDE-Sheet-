public class FlatteningaLinkedList {
    public static void main(String[] args) {

    }

    // https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1#

    Node flatten(Node root) {
        // Your code here

        if (root == null || root.next == null) {
            return root;
        }

        return merge(root, flatten(root.next));
    }

    private Node merge(Node r1, Node r2) {

        if (r1 == null)
            return r2;
        if (r2 == null)
            return r1;

        Node res = null;
        if (r1.data < r2.data) {
            res = r1;
            res.bottom = merge(r1.bottom, r2);

        } else {
            res = r2;
            res.bottom = merge(r1, r2.bottom);

        }

        res.next = null;
        return res;
    }

    // https://www.codingninjas.com/codestudio/problems/1112655

    public static Node flattenLinkedList(Node start) {
        // Write your code here

        if (start == null || start.next == null) {
            return start;
        }

        return merge(start, flattenLinkedList(start.next));
    }

    private static Node merge(Node r, Node s) {

        if (r == null) {
            return s;
        }
        if (s == null) {
            return r;
        }

        Node res = null;

        if (r.data < s.data) {
            res = r;
            res.child = merge(r.child, s);
        } else {
            res = s;
            res.child = merge(r, s.child);
        }

        res.next = null;
        return res;

    }
}
