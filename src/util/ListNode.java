package util;

import java.util.Arrays;
import java.util.Objects;

public class ListNode implements Comparable {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode createLinkNodes(Integer... args) {
        if (args == null) return null;

        ListNode head = new ListNode(0), dummy = head;
        for (Integer i : args) {
            head.next = new ListNode(i);
            head = head.next;
        }
        return dummy.next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {

        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof ListNode) {
            return Integer.compare(val, ((ListNode) o).val);
        }
        return this.compareTo(o);
    }
}
