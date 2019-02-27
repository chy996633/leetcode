import static org.junit.Assert.*;

import org.junit.Test;
import util.ListNode;

public class ReverseLinkedListTwoTest {

    @Test
    public void reverseBetween() {

        ReverseLinkedListTwo alg = new ReverseLinkedListTwo();
        assertEquals(ListNode.createLinkNodes(1,4,3,2,5), alg.reverseBetween(ListNode.createLinkNodes(1,2,3,4,5), 2, 4));
        assertEquals(ListNode.createLinkNodes(2,1,3,4,5), alg.reverseBetween(ListNode.createLinkNodes(1,2,3,4,5), 1, 2));
        assertEquals(ListNode.createLinkNodes(5,4,3,2,1), alg.reverseBetween(ListNode.createLinkNodes(1,2,3,4,5), 1, 5));
        assertEquals(ListNode.createLinkNodes(1,2,3,5,4), alg.reverseBetween(ListNode.createLinkNodes(1,2,3,4,5), 4, 5));

    }
}