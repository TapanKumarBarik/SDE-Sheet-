public class PalindromeLinkedList {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/palindrome-linked-list/

    public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }

            fast = fast.next;
            slow = slow.next;
        }
        return true;

    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode curr = new ListNode(head.val);
            curr.next = prev;
            prev = curr;
            head = head.next;
        }
        return prev;
    }

    // https://www.codingninjas.com/codestudio/problems/799352

    // FAULTY

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        // Write your code here!

        LinkedListNode<Integer> fast = head;
        LinkedListNode<Integer> slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverse(slow);

        fast = head;

        while (slow != null) {

            if (fast.data != slow.data) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> prev = null;

        while (head != null) {

            LinkedListNode<Integer> temp = new LinkedListNode<Integer>(head.data);
            temp.next = prev;
            prev = temp;
            head = head.next;
        }
        return prev;
    }
}
