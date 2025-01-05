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

    @Test
    void reverse() {
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node10 = new ListNode(10);
        ListNode node8 = new ListNode(8, node10);
        ListNode node6 = new ListNode(6, node8);
        ListNode node4 = new ListNode(4, node6);
        ListNode node2 = new ListNode(2, node4);
        ListNode result = solutionReRe.reverse(node2);
        System.out.println();
        System.out.println();
        System.out.println();
        result.print();
    }

    @Test
    void merge_oneMoreElementOnFirstHalf() {
        SolutionReRe solutionReRe = new SolutionReRe();
        // second half
        ListNode node10 = new ListNode(10);
        ListNode node8 = new ListNode(8, node10);
        // first half
        ListNode node6 = new ListNode(6);
        ListNode node4 = new ListNode(4, node6);
        ListNode node2 = new ListNode(2, node4);
        ListNode result = solutionReRe.merge(node2, node8);
        System.out.println();
        System.out.println();
        System.out.println();
        result.print();
    }

    @Test
    void merge_sameElementCount() {
        SolutionReRe solutionReRe = new SolutionReRe();
        // second half
        ListNode node10 = new ListNode(10);
        ListNode node8 = new ListNode(8, node10);
        // first half
        ListNode node4 = new ListNode(4);
        ListNode node2 = new ListNode(2, node4);
        ListNode result = solutionReRe.merge(node2, node8);
        System.out.println();
        System.out.println();
        System.out.println();
        result.print();
    }

    @Test
    public void removeNthFromEnd() {
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = solutionReRe.removeNthFromEnd(node1, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        result.print();
    }
}