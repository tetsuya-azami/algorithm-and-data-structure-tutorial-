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

    public ListNodePair divide(ListNode head) {
        if (head == null) return new ListNodePair(null, null);
        ListNode slow = head;
        ListNode fast = head.next;
        /*
         * 偶数の場合はfast.next == null
         * 奇数の場合はfast == null
         * の時にslowが前半Listの最後の要素を指しているため探索を終わりにしたい。
         */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        return new ListNodePair(head, second);
    }

    public record ListNodePair(ListNode first, ListNode second) {
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode originalCurNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = originalCurNext;
        }

        return prev;
    }

    public ListNode merge(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0, first);
        while (second != null) {
            ListNode originalFirstNext = first.next;
            ListNode originalSecondNext = second.next;
            first.next = second;
            first = originalFirstNext;
            second.next = first;
            second = originalSecondNext;
        }

        return dummy.next;
    }
}
