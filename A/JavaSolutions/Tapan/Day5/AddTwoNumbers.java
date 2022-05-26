public class AddTwoNumbers {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/add-two-numbers/

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode temp = head;
        int carry = 0;

        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode curr = new ListNode(sum);
            temp.next = curr;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode curr = new ListNode(sum);
            temp.next = curr;
            temp = temp.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode curr = new ListNode(sum);
            temp.next = curr;
            temp = temp.next;
            l2 = l2.next;
        }

        if (carry != 0) {
            ListNode curr = new ListNode(carry);
            temp.next = curr;
        }
        return head.next;
    }

    // https://www.codingninjas.com/codestudio/problems/add-two-numbers-as-linked-lists_1170520
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.

        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode temp = head;

        int carry = 0;
        while (head1 != null && head2 != null) {
            int sum = head1.data + head2.data + carry;
            carry = sum / 10;
            sum %= 10;
            LinkedListNode curr = new LinkedListNode(sum);
            temp.next = curr;
            temp = temp.next;
            head1 = head1.next;
            head2 = head2.next;
        }

        while (head1 != null) {
            int sum = head1.data + carry;
            carry = sum / 10;
            sum %= 10;
            LinkedListNode curr = new LinkedListNode(sum);
            temp.next = curr;
            temp = temp.next;
            head1 = head1.next;
        }

        while (head2 != null) {
            int sum = head2.data + carry;
            carry = sum / 10;
            sum %= 10;
            LinkedListNode curr = new LinkedListNode(sum);
            temp.next = curr;
            temp = temp.next;
            head2 = head2.next;
        }

        if (carry != 0) {
            LinkedListNode curr = new LinkedListNode(carry);
            temp.next = curr;
        }

        return head.next;
    }
}
