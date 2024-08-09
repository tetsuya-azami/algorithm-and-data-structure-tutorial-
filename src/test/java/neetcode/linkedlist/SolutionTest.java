package neetcode.linkedlist;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void reverseList() {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(0, node1);
        Solution solution = new Solution();
        ListNode result = solution.reverseList(head);
        System.out.println();
        System.out.println();
        System.out.println();

        ListNode current = result;
        while (true) {
            System.out.print(current.val + ",");
            if (current.next == null) break;
            current = current.next;
        }
    }

    @Test
    public void reverseEmptyList() {
        Solution solution = new Solution();
        ListNode result = solution.reverseList(null);
        System.out.println();
        System.out.println();
        System.out.println();

        ListNode current = result;

        while (true) {
            System.out.print(current.val + ",");
            if (current.next == null) break;
            current = current.next;
        }
    }

    @Test
    public void reverseListModelAnswer() {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(0, node1);
        Solution solution = new Solution();
        ListNode result = solution.reverseListModelAnswer(head);
        System.out.println();
        System.out.println();
        System.out.println();

        ListNode current = result;
        while (true) {
            System.out.print(current.val + ",");
            if (current.next == null) break;
            current = current.next;
        }
    }
}