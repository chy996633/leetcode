import util.ListNode;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //special
        if (head.next == null) return null;

        //define two pointers, first and second
        ListNode dummy = new ListNode(0), first = dummy, second = dummy;
        dummy.next = head;

        //move the first pointer
        for (int i=1;i<=n+1;i++) {
            first = first.next;
        }

        //move the second along with first until the end
        while (first != null) {
            second = second.next;
            first = first.next;
        }

        //remove the nth element
        second.next = second.next.next;
        return dummy.next;
    }



}
