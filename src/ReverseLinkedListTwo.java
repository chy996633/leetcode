import java.util.List;
import util.ListNode;

public class ReverseLinkedListTwo {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return null;

        //define pointers
        ListNode dummy = new ListNode(0), pre = dummy;
        dummy.next = head;

        //setup pre
        for (int i=0;i<m-1;i++) pre = pre.next;

        ListNode start = pre.next;
        ListNode then = start.next;

        //iterative
        for (int i=0;i<n-m;i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }

        return dummy.next;

    }

}
