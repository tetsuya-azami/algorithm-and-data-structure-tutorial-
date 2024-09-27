package neetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        if (list1 != null) {
            prev.next = list1;
        }
        if (list2 != null) {
            prev.next = list2;
        }

        return dummy.next;
    }

    public boolean hasCycle(ListNode head) {
        List<ListNode> visited = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            if (visited.contains(cur)) return true;
            visited.add(cur);
            cur = cur.next;
        }
        return false;
    }

    public boolean hasCycleModelAnswer(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) return true;
        }

        return false;
    }

    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        while (second != null) {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }

    public void reorderListRe(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;

        // 順番を入れ替える
        ListNode pre = null;
        while (second != null) {
            ListNode tmp = second.next;
            second.next = pre;
            pre = second;
            second = tmp;
        }

        while (pre != null) {
            ListNode tmp1 = head.next;
            ListNode tmp2 = pre.next;
            head.next = pre;
            pre.next = tmp1;
            head = tmp1;
            pre = tmp2;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // dummy(L),1,2,3,4
        ListNode dummy = new ListNode(0, head);
        ListNode l = dummy;
        ListNode r = head;
        while (n > 0) {
            r = r.next;
            n--;
        }

        while (r != null) {
            r = r.next;
            l = l.next;
        }

        l.next = l.next.next;
        return dummy.next;
    }
}

