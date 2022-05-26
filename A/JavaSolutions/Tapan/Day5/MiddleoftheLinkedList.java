public class MiddleoftheLinkedList {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/middle-of-the-linked-list/

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // https://www.codingninjas.com/codestudio/problems/973250

    public static Node findMiddle(Node head) {
        // Write your code here

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
