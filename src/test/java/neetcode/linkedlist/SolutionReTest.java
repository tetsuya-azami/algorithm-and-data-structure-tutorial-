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

    @Test
    public void mergeTwoLists() {
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
    public void hasCycle() {
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
}