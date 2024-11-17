package neetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class SolutionRe {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

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
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (fast == null) return false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }

    public void reorderListBruteForce(ListNode head) {
        if (head == null) return;
        List<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            nodes.add(cur);
            cur = cur.next;
        }

        int right = nodes.size() - 1;
        int left = 0;
        while (left < right) {
            nodes.get(left).next = nodes.get(right);
            nodes.get(right).next = nodes.get(left + 1);
            left++;
            right--;
        }
        nodes.get(left).next = null;
    }

    public void reorderListReverseAndMerge(ListNode head) {
        if (head == null) return;
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
            ListNode originalNext = second.next;
            second.next = prev;
            prev = second;
            second = originalNext;
        }
        second = prev;

        while (second != null) {
            ListNode firstOriginalNext = head.next;
            ListNode secondOriginalNext = second.next;
            head.next = second;
            second.next = firstOriginalNext;
            head = firstOriginalNext;
            second = secondOriginalNext;
        }
    }

    public void reorderListRecursion(ListNode head) {
        if (head == null) return;
        rec(head, head.next);
    }

    private ListNode rec(ListNode root, ListNode cur) {
        if (cur == null) {
            return root;
        }
        root = rec(root, cur.next);

        if (root == null) return null;

        if (root == cur || root.next == cur) {
            cur.next = null;
            return null;
        } else {
            ListNode originalRootNext = root.next;
            root.next = cur;
            cur.next = originalRootNext;
            return originalRootNext;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int indexFromEnd = recRemoveNthFromEnd(head, n);
        if (indexFromEnd == n) return head.next;
        return head;
    }

    private int recRemoveNthFromEnd(ListNode cur, int n) {
        if (cur == null) {
            return 0;
        }
        int indexFromEnd = recRemoveNthFromEnd(cur.next, n) + 1;

        if (indexFromEnd == n + 1) {
            cur.next = cur.next.next;
        }

        return indexFromEnd;
    }
}
