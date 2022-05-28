public class IntersectionofTwoLinkedLists {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/intersection-of-two-linked-lists/

    // O(N) SPACE

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> set = new HashSet();

        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {

            if (set.contains(headB)) {
                break;
            }
            headB = headB.next;
        }
        return headB;
    }

    // O(1) SPACE

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        /*
         * HashSet<ListNode>set=new HashSet();
         * 
         * while(headA!=null){
         * set.add(headA);
         * headA=headA.next;
         * }
         * 
         * while(headB!=null){
         * 
         * if(set.contains(headB)){
         * break;
         * }
         * headB=headB.next;
         * }
         * return headB;
         */

        ListNode a = headA;
        ListNode b = headB;

        int flag1 = 0;
        int flag2 = 0;
        while (headA != headB) {
            if (flag1 > 1 || flag2 > 1) {
                return null;
            }

            headA = headA.next;
            headB = headB.next;
            if (headA == null) {
                headA = b;
                flag1++;
            }
            if (headB == null) {
                headB = a;
                flag2++;
            }
        }
        return headA;
    }

    // https://www.codingninjas.com/codestudio/problems/630457

    public static int findIntersection(LinkedListNode<Integer> headA, LinkedListNode<Integer> headB) {

        LinkedListNode<Integer> a = headA;
        LinkedListNode<Integer> b = headB;

        int flag1 = 0;
        int flag2 = 0;
        while (headA != headB) {
            if (flag1 > 1 || flag2 > 1) {
                return -1;
            }

            headA = headA.next;
            headB = headB.next;
            if (headA == null) {
                headA = b;
                flag1++;
            }
            if (headB == null) {
                headB = a;
                flag2++;
            }
        }
        return headA.data;
    }
}
