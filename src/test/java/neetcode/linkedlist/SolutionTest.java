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

    @Test
    public void reorderList() {
        Solution solution = new Solution();
        ListNode node10 = new ListNode(10);
        ListNode node8 = new ListNode(8, node10);
        ListNode node6 = new ListNode(6, node8);
        ListNode node4 = new ListNode(4, node6);
        ListNode node2 = new ListNode(2, node4);
        solution.reorderList(node2);
        System.out.println();
        System.out.println();
        System.out.println();
        node2.print();
    }

    @Test
    public void reorderListRe() {
        Solution solution = new Solution();
        ListNode node10 = new ListNode(10);
        ListNode node8 = new ListNode(8, node10);
        ListNode node6 = new ListNode(6, node8);
        ListNode node4 = new ListNode(4, node6);
        ListNode node2 = new ListNode(2, node4);
        solution.reorderListRe(node2);
        System.out.println();
        System.out.println();
        System.out.println();
        node2.print();
    }

    @Test
    public void removeNthFromEnd() {
        Solution solution = new Solution();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = solution.removeNthFromEnd(node1, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        result.print();
    }

    @Test
    public void copyRandomList() {
        Node node3 = new Node(3);
        Node node7 = new Node(7);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node3.next = node7;
        node7.next = node4;
        node4.next = node5;
        node5.next = null;
        node3.random = null;
        node7.random = node5;
        node4.random = node3;
        node5.random = node7;
        Solution solution = new Solution();
        Node result = solution.copyRandomList(node3);
        result.print();
    }

    @Test
    public void addTwoNumbers() {
        Solution solution = new Solution();
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode result = solution.addTwoNumbers(node1, node4);
        result.print();
    }

    @Test
    public void findDuplicate() {
        Solution solution = new Solution();
        int result = solution.findDuplicate(new int[]{1, 2, 3, 2, 2});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}