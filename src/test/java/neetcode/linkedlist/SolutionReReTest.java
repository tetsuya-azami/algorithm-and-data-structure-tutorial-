package neetcode.linkedlist;

import org.junit.jupiter.api.Test;

class SolutionReReTest {
    @Test
    void reorderList() {
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

    @Test
    void divideOdd() {
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node10 = new ListNode(10);
        ListNode node8 = new ListNode(8, node10);
        ListNode node6 = new ListNode(6, node8);
        ListNode node4 = new ListNode(4, node6);
        ListNode node2 = new ListNode(2, node4);
        SolutionReRe.ListNodePair divided = solutionReRe.divide(node2);
        System.out.println();
        System.out.println();
        System.out.println();
        divided.first().print();
        divided.second().print();
    }

    @Test
    void divideEven() {
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node8 = new ListNode(8);
        ListNode node6 = new ListNode(6, node8);
        ListNode node4 = new ListNode(4, node6);
        ListNode node2 = new ListNode(2, node4);
        SolutionReRe.ListNodePair divided = solutionReRe.divide(node2);
        System.out.println();
        System.out.println();
        System.out.println();
        divided.first().print();
        divided.second().print();
    }
}