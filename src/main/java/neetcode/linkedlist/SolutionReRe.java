package neetcode.linkedlist;

public class SolutionReRe {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (second != null) {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode originalFirstNext = first.next;
            ListNode originalSecondNext = second.next;
            first.next = second;
            second.next = originalFirstNext;
            first = originalFirstNext;
            second = originalSecondNext;
        }
    }
}
