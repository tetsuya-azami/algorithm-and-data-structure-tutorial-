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

    public ListNode removeNthFromEndTwoPointers(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = head;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        while (right != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;

        return dummy.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode l1Cur = l1;
        ListNode l2Cur = l2;
        while (l1Cur != null || l2Cur != null || carry != 0) {
            int l1Val = l1Cur != null ? l1Cur.val : 0;
            int l2Val = l2Cur != null ? l2Cur.val : 0;
            int sum = l1Val + l2Val + carry;
            carry = sum / 10;
            sum = sum % 10;

            prev.next = new ListNode(sum);
            prev = prev.next;

            if (l1Cur != null) {
                l1Cur = l1Cur.next;
            }
            if (l2Cur != null) {
                l2Cur = l2Cur.next;
            }
        }

        return dummy.next;
    }

    public ListNode addTwoNumbersRe(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sum = l1Val + l2Val + carry;
            carry = sum / 10;
            sum = sum % 10;

            ListNode cur = new ListNode(sum);
            prev.next = cur;
            prev = prev.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummy.next;
    }

    public int findDuplicateUsingArray(int[] nums) {
        int[] ints = new int[nums.length - 1];
        for (int num : nums) {
            if (ints[num - 1] != 0) {
                return num;
            }
            ints[num - 1] = 1;
        }

        return -1;
    }

    public int findDuplicateFloyd(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                break;
            }
        }

        int slow2 = 0;
        while (true) {
            slow = nums[slow];
            slow2 = nums[slow2];
            if (slow == slow2) {
                return slow;
            }
        }
    }
}
