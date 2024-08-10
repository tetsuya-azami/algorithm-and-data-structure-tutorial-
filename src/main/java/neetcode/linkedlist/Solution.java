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
}
