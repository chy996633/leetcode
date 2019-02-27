import util.ListNode;

public class RemoveLinkedListElements {

    public ListNode solution(ListNode head, int val) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        while (p != null) {
            ListNode temp = p.next;
            if (temp != null && temp.val == val) {
                p.next = temp.next;
            }
            else {
                p = p.next;
            }

        }

        return dummy.next;
    }

}
