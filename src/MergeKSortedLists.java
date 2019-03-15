import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import util.ListNode;

public class MergeKSortedLists {

    /**
     * use priorityQueue
     */
    public ListNode mergeKLists(ListNode[] lists) {
        // define priorityQueue
        PriorityQueue<ListNode> q= new PriorityQueue<ListNode>(lists.length , new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                if (o1.val<o2.val)
                    return -1;
                else if (o1.val==o2.val)
                    return 0;
                else
                    return 1;
            }
        });

        // pop queue with list head
        for (ListNode head : lists) {
            if (head != null) {
                q.add(head);
            }
        }

        // pop from queue and append node to new list, add next from poll element to queue
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (!q.isEmpty()) {
            temp.next = q.poll();
            if (temp.next.next != null) {
                q.add(temp.next.next);
            }
            temp = temp.next;
        }
        return dummy.next;
    }

}
