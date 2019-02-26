import static org.junit.Assert.*;

import org.junit.Test;
import util.ListNode;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void removeNthFromEnd() {
        ListNode n = new ListNode(1);
        n.next = new ListNode(2);
        n.next.next = new ListNode(3);
        n.next.next.next = new ListNode(4);
        n.next.next.next.next = new ListNode(5);

        RemoveNthNodeFromEndOfList alg = new RemoveNthNodeFromEndOfList();
        assertEquals(n.next, alg.removeNthFromEnd(n, 5));

        ListNode r = new ListNode(1);
        r.next = new ListNode(2);

        assertEquals(r, alg.removeNthFromEnd(r, 1));

        ListNode q = new ListNode(1);
        assertEquals(null, alg.removeNthFromEnd(q, 1));
    }
}