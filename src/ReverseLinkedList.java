import util.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        //define Two pointers
        ListNode slow = null;
        ListNode fast = head;

        //iterative
        while (fast != null) {
            ListNode temp = slow;
            slow = fast;
            fast = fast.next;
            slow.next = temp;
        }

        return slow;
    }

}
