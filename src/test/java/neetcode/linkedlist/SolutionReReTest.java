package neetcode.linkedlist;

import org.junit.jupiter.api.Test;

class SolutionReReTest {
    @Test
    public void reorderList() {
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node10 = new ListNode(10);
        ListNode node8 = new ListNode(8, node10);
        ListNode node6 = new ListNode(6, node8);
        ListNode node4 = new ListNode(4, node6);
        ListNode node2 = new ListNode(2, node4);
        solutionReRe.reorderList(node2);
        System.out.println();
        System.out.println();
        System.out.println();
        node2.print();
    }
}