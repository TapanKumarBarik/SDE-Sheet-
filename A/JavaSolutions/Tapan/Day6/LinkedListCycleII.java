public class LinkedListCycleII {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/linked-list-cycle-ii/

    public ListNode detectCycle(ListNode head) {

        /*
         * if(head==null || head.next==null){return null;}
         * ListNode fast=head;
         * ListNode slow=head;
         * 
         * while( slow!=null && fast!=null && fast.next!=null){
         * fast=fast.next.next;
         * slow=slow.next;
         * if(fast==slow){
         * break;
         * }
         * }
         * if(slow!=fast)return null;
         * slow=head;
         * while(slow!=fast){
         * slow=slow.next;
         * fast=fast.next;
         * }
         * return slow;
         */

        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (slow != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }

    // https://www.codingninjas.com/codestudio/problems/1112628
    public static Node firstNode(Node head) {
        // Write your code here.

        if (head == null || head.next == null) {
            return null;
        }

        Node fast = head;
        Node slow = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                break;
        }

        if (fast != slow)
            return null;

        slow = head;

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
