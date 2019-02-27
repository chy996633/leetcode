import static org.junit.Assert.*;

import org.junit.Test;
import sun.awt.image.ImageWatched.Link;
import util.ListNode;

public class RemoveLinkedListElementsTest {

    @Test
    public void solution() {
        RemoveLinkedListElements alg = new RemoveLinkedListElements();
        ListNode a = new ListNode(1);
        a.next = new ListNode(1);
        assertEquals(null, alg.solution(a, 1));

        ListNode b = new ListNode(1);
        b.next = new ListNode(2);
        b.next.next = new ListNode(3);
        b.next.next.next = new ListNode(2);
        b.next.next.next.next = new ListNode(4);
        ListNode c = new ListNode(1);
        c.next = new ListNode(3);
        c.next.next = new ListNode(4);
        assertEquals(c, alg.solution(b, 2));

        ListNode d = new ListNode(1);
        d.next = new ListNode(2);
        d.next.next = new ListNode(1);
        ListNode e = new ListNode(2);
        assertEquals(e, alg.solution(d, 1));



    }
}