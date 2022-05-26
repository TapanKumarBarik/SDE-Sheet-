public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/reverse-linked-list/

    public ListNode reverseList(ListNode head) {

        ListNode res = null;
        ListNode prev = res;
        while (head != null) {
            ListNode curr = new ListNode(head.val);
            curr.next = prev;
            prev = curr;
            head = head.next;
        }
        return prev;

    }

    /*
     * Recursive
     * 
     * 
     * public ListNode reverseList(ListNode head) {
     * 
     * return reverse(head, null);
     * 
     * }
     * private ListNode reverse(ListNode head, ListNode prev){
     * 
     * if(head==null){
     * return prev;
     * }
     * 
     * ListNode curr=head.next;
     * 
     * head.next=prev;
     * return reverse(curr, head);
     * }
     * 
     */
    // https:// www.codingninjas.com/codestudio/problems/799897

    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        // Write your code here!
        LinkedListNode<Integer> prev = null;
        while (head != null) {
            LinkedListNode<Integer> temp = new LinkedListNode(head.data);
            temp.next = prev;
            prev = temp;
            head = head.next;
        }
        return prev;
    }

    /*
     * Recursive
     * 
     * public static LinkedListNode<Integer>
     * reverseLinkedList(LinkedListNode<Integer> head)
     * {
     * LinkedListNode<Integer> prev=null;
     * return solve(prev, head);
     * }
     * private static LinkedListNode<Integer> solve(LinkedListNode<Integer>
     * prev,LinkedListNode<Integer>head){
     * 
     * if(head==null){
     * return prev;
     * }
     * 
     * LinkedListNode<Integer> temp=head.next;
     * head.next=prev;
     * 
     * return solve(head, temp);
     * 
     * }
     */
}
