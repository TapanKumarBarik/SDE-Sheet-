public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/merge-two-sorted-lists/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode head = new ListNode(0);

        ListNode curr = head;

        while (list1 != null && list2 != null) {

            if (list1.val > list2.val) {

                ListNode temp = new ListNode(list2.val);
                list2 = list2.next;

                curr.next = temp;
                curr = curr.next;
            }

            else if (list1.val < list2.val) {
                ListNode temp = new ListNode(list1.val);
                list1 = list1.next;

                curr.next = temp;
                curr = curr.next;
            } else {

                ListNode temp = new ListNode(list1.val);
                ListNode temp1 = new ListNode(list2.val);
                list1 = list1.next;
                list2 = list2.next;
                curr.next = temp;
                curr = curr.next;
                curr.next = temp1;
                curr = curr.next;
            }

        }

        //

        if (list1 != null) {
            curr.next = list1;

        }

        if (list2 != null) {
            curr.next = list2;

        }

        return head.next;
    }

    // RECURSIVE SOLUTION

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        /*
         * if(list1==null)return list2;
         * if(list2==null)return list1;
         * ListNode head=new ListNode(0);
         * ListNode curr=head;
         * while(list1!=null && list2!=null){
         * if(list1.val>list2.val){
         * ListNode temp=new ListNode(list2.val);
         * list2=list2.next;
         * curr.next=temp;
         * curr=curr.next;
         * }
         * else if(list1.val<list2.val){
         * ListNode temp=new ListNode(list1.val);
         * list1=list1.next;
         * curr.next=temp;
         * curr=curr.next;
         * }
         * else{
         * ListNode temp=new ListNode(list1.val);
         * ListNode temp1=new ListNode(list2.val);
         * list1=list1.next;
         * list2=list2.next;
         * curr.next=temp;
         * curr=curr.next;
         * curr.next=temp1;
         * curr=curr.next;
         * }
         * }
         * if(list1!=null ){
         * curr.next=list1;
         * }
         * if(list2!=null ){
         * curr.next=list2;
         * }
         * return head.next;
         * 
         */

        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    // https://www.codingninjas.com/codestudio/problems/800332

    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> f, LinkedListNode<Integer> s) {
        // Write your code here.
        if (f == null)
            return s;

        if (s == null)
            return f;

        if (f.data < s.data) {
            f.next = sortTwoLists(f.next, s);
            return f;
        } else {
            s.next = sortTwoLists(f, s.next);
            return s;
        }
    }
}
