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

    @Test
    public void mergeTwoLists() {
        ListNode list1Node4 = new ListNode(4);
        ListNode list1Node2 = new ListNode(2, list1Node4);
        ListNode list1Node1 = new ListNode(1, list1Node2);

        ListNode list2Node5 = new ListNode(5);
        ListNode list2Node3 = new ListNode(3, list2Node5);
        ListNode list2Node1 = new ListNode(1, list2Node3);

//        ListNode list1Node1 = null;
//        ListNode list2Node2 = new ListNode(2);
//        ListNode list2Node1 = new ListNode(1, list2Node2);
        Solution solution = new Solution();
        ListNode result = solution.mergeTwoLists(list1Node1, list2Node1);
        System.out.println();
        System.out.println();
        System.out.println();

        ListNode current = result;
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
        Solution solution = new Solution();
        boolean result = solution.hasCycle(node1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void hasCycleModelAnswer() {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        node4.next = node2;
        Solution solution = new Solution();
        boolean result = solution.hasCycleModelAnswer(node1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}