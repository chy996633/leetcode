import static org.junit.Assert.*;

import org.junit.Test;
import util.ListNode;

public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ReverseLinkedList alg = new ReverseLinkedList();

        assertEquals(ListNode.createLinkNodes(5,4,3,2,1), alg.reverseList(ListNode.createLinkNodes(1,2,3,4,5)));
        assertEquals(ListNode.createLinkNodes(1), alg.reverseList(ListNode.createLinkNodes(1)));
        assertEquals(ListNode.createLinkNodes(1), alg.reverseList(ListNode.createLinkNodes(1)));

    }
}