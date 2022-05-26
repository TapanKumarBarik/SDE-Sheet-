public class DeleteNodeInALinkedList {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/delete-node-in-a-linked-list/

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }

    // https://www.codingninjas.com/codestudio/problems/1105578

    public static void deleteNode(LinkedListNode<Integer> node) {
        // Write your code here.

        node.data = node.next.data;
        node.next = node.next.next;
    }
}
