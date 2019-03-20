import static org.junit.Assert.*;

import org.junit.Test;
import util.ListNode;

public class MergeKSortedListsTest {

    @Test
    public void mergeKLists() {
        ListNode[] lists = new ListNode[]{ ListNode.createLinkNodes(1, 4, 5),
                ListNode.createLinkNodes(1, 3, 4), ListNode.createLinkNodes(2,6)};
        MergeKSortedLists msl = new MergeKSortedLists();
        ListNode result = msl.mergeKLists(lists);
        assertEquals(ListNode.createLinkNodes(1,1,2,3,4,4,5,6), result);
        assertEquals(ListNode.createLinkNodes(null), msl.mergeKLists(new ListNode[0]));
    }

    @Test
    public void divideAndConquer() {
        ListNode[] lists = new ListNode[]{ ListNode.createLinkNodes(1, 4, 5),
                ListNode.createLinkNodes(1, 3, 4), ListNode.createLinkNodes(2,6)};
        MergeKSortedLists msl = new MergeKSortedLists();
        ListNode result = msl.divideAndConquer(lists, 0, lists.length - 1);
        assertEquals(ListNode.createLinkNodes(1,1,2,3,4,4,5,6), result);
        assertEquals(ListNode.createLinkNodes(null), msl.divideAndConquer(new ListNode[0],0, -1));
    }
}