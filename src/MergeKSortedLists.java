import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import util.ListNode;

public class MergeKSortedLists {

    /**
     * use priorityQueue
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
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

    public ListNode divideAndConquer(ListNode[] lists, int start, int end) {
        //return final situation
        if (start == end) {
            return lists[start];
        } else if (start == end - 1) {
            return merge2Lists(lists[start], lists[end]);
        } else if (start > end) {
            return null;
        }

        //divide
        ListNode a = divideAndConquer(lists, start, start + (end - start) / 2);
        ListNode b = divideAndConquer(lists, start + (end - start) / 2 + 1, end);

        return merge2Lists(a, b);
    }

    public ListNode merge2Lists(ListNode first, ListNode second) {
        if (second == null) return first;
        if (first == null) return second;

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (first != null && second != null) {
            if (first.val < second.val) {
                head.next = first;
                first = first.next;
            } else {
                head.next = second;
                second = second.next;
            }
            head = head.next;
        }
        if (first != null) head.next = first;
        if (second != null) head.next = second;

        return dummy.next;
    }

}
