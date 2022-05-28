public class LinkedListCycle {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/linked-list-cycle/

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    // https:// www.codingninjas.com/codestudio/problems/628974

    public static boolean detectCycle(Node<Integer> head) {
        // Your code goes here

        if (head == null || head.next == null)
            return false;
        Node<Integer> fast = head;
        Node<Integer> slow = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;

            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
