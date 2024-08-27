package neetcode.linkedlist;

import org.junit.jupiter.api.Test;

class SolutionReTest {
    @Test
    public void reverseList() {
        SolutionRe solutionRe = new SolutionRe();
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(0, node1);
        ListNode result = solutionRe.reverseList(head);
        System.out.println();
        System.out.println();
        System.out.println();
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + ",");
            current = current.next;
        }
    }
}