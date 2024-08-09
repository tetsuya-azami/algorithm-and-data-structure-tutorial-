package neetcode.linkedlist;

public class Solution {
    public ListNode reverseList(ListNode head) {
        return rec(null, head);
    }

    private ListNode rec(ListNode prev, ListNode current) {
        if (current == null) return null;
        ListNode originalNext = current.next;
        current.next = prev;
        if (originalNext == null) {
            return current;
        } else {
            return rec(current, originalNext);
        }
    }

    public ListNode reverseListModelAnswer(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }
}
