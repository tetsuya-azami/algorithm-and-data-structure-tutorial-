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

    @Test
    public void removeNthFromEndBruteForce() {
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = solutionReRe.removeNthFromEndBruteForce(node1, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        result.print();
    }

    @Test
    public void removeNthFromEndRecursion() {
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = solutionReRe.removeNthFromEndRecursion(node1, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        result.print();
    }

    @Test
    public void removeNthFromEndTwoPointers() {
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = solutionReRe.removeNthFromEndTwoPointers(node1, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        result.print();
    }

    @Test
    public void removeNthFromEndTwoPointers2() {
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node = new ListNode(5);
        ListNode result = solutionReRe.removeNthFromEndTwoPointers(node, 1);
        System.out.println();
        System.out.println();
        System.out.println();
        result.print();
    }

    @Test
    void addTwoNumbers() {
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode result = solutionReRe.addTwoNumbers(node1, node4);
        result.print();
    }

    @Test
    void addTwoNumbers2() {
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode result = solutionReRe.addTwoNumbers(node1, node2);
        result.print();
    }

    @Test
    void addTwoNumbers3() {
        //9,9,9,9,9,9,9| 9,9,9,9
        SolutionReRe solutionReRe = new SolutionReRe();
        ListNode node15 = new ListNode(9);
        ListNode node14 = new ListNode(9, node15);
        ListNode node13 = new ListNode(9, node14);
        ListNode node12 = new ListNode(9, node13);
        ListNode node11 = new ListNode(9, node12);

        ListNode node24 = new ListNode(9);
        ListNode node23 = new ListNode(9, node24);
        ListNode node22 = new ListNode(9, node23);
        ListNode node21 = new ListNode(9, node22);
        ListNode result = solutionReRe.addTwoNumbers(node11, node21);
        result.print();
    }
}