package neetcode.linkedlist;

import org.junit.jupiter.api.Test;

class SolutionReTest {
    @Test
    void reverseList() {
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

    @Test
    void mergeTwoLists() {
        SolutionRe solutionRe = new SolutionRe();
        ListNode list1Node4 = new ListNode(4);
        ListNode list1Node2 = new ListNode(2, list1Node4);
        ListNode list1Node1 = new ListNode(1, list1Node2);

        ListNode list2Node5 = new ListNode(5);
        ListNode list2Node3 = new ListNode(3, list2Node5);
        ListNode list2Node1 = new ListNode(1, list2Node3);

        ListNode current = solutionRe.mergeTwoLists(list1Node1, list2Node1);
        while (current != null) {
            System.out.println(current.val + ",");
            current = current.next;
        }
    }

    @Test
    void hasCycle() {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        node4.next = node2;
        SolutionRe solutionRe = new SolutionRe();
        boolean result = solutionRe.hasCycle(node1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void reorderList() {
        SolutionRe solutionRe = new SolutionRe();
        ListNode node10 = new ListNode(10);
        ListNode node8 = new ListNode(8, node10);
        ListNode node6 = new ListNode(6, node8);
        ListNode node4 = new ListNode(4, node6);
        ListNode node2 = new ListNode(2, node4);
        solutionRe.reorderListBruteForce(node2);
        System.out.println();
        System.out.println();
        System.out.println();
        node2.print();
    }

    @Test
    void reorderListReverseAndMerge() {
        SolutionRe solutionRe = new SolutionRe();
        ListNode node10 = new ListNode(10);
        ListNode node8 = new ListNode(8, node10);
        ListNode node6 = new ListNode(6, node8);
        ListNode node4 = new ListNode(4, node6);
        ListNode node2 = new ListNode(2, node4);
        solutionRe.reorderListReverseAndMerge(node2);
        System.out.println();
        System.out.println();
        System.out.println();
        node2.print();
    }

    @Test
    void reorderListRecursion() {
        SolutionRe solutionRe = new SolutionRe();
        ListNode node10 = new ListNode(10);
        ListNode node8 = new ListNode(8, node10);
        ListNode node6 = new ListNode(6, node8);
        ListNode node4 = new ListNode(4, node6);
        ListNode node2 = new ListNode(2, node4);
        solutionRe.reorderListRecursion(node2);
        System.out.println();
        System.out.println();
        System.out.println();
        node2.print();
    }

    @Test
    void removeNthFromEnd() {
        SolutionRe solutionRe = new SolutionRe();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = solutionRe.removeNthFromEnd(node1, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        result.print();
    }

    @Test
    void removeNthFromEndTwoPointers() {
        SolutionRe solutionRe = new SolutionRe();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = solutionRe.removeNthFromEndTwoPointers(node1, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        result.print();
    }

    @Test
    void addTwoNumbers() {
        SolutionRe solutionRe = new SolutionRe();
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode result = solutionRe.addTwoNumbers(node1, node4);
        result.print();
    }

    @Test
    void addTwoNumbers9() {
        SolutionRe solutionRe = new SolutionRe();
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode result = solutionRe.addTwoNumbers(l1, l2);
        result.print();
    }

    @Test
    void addTwoNumbersRe() {
        SolutionRe solutionRe = new SolutionRe();
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode result = solutionRe.addTwoNumbersRe(node1, node4);
        result.print();
    }

    @Test
    void findDuplicateUsingArray() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.findDuplicateUsingArray(new int[]{1, 2, 3, 2, 2});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void findDuplicateFloyd() {
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.findDuplicateFloyd(new int[]{1, 2, 3, 2, 2});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}