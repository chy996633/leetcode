package util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListNodeTest {

    @Test
    public void createLinkNodes() {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);

        assertEquals(a, ListNode.createLinkNodes(1,2,3));
        assertEquals(null, ListNode.createLinkNodes(null));
        assertNotEquals(a, ListNode.createLinkNodes(1));

    }
}