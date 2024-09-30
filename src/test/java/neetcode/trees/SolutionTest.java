package neetcode.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

class SolutionTest {
    private static void printResult(TreeNode result) {
        System.out.println();
        System.out.println();
        System.out.println();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(result);
        while (!queue.isEmpty()) {
            TreeNode first = queue.getFirst();
            queue.removeFirst();
            System.out.print(first.val + ",");

            TreeNode left = first.left;
            if (left != null) queue.addLast(left);
            TreeNode right = first.right;
            if (right != null) queue.addLast(right);
        }
        System.out.println();
    }

    @Test
    public void invertTree() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode root = new TreeNode(1, node2, node3);
        Solution solution = new Solution();
        TreeNode result = solution.invertTree(root);

        printResult(result);
    }

    @Test
    public void maxDepth() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3, node4, null);
        TreeNode root = new TreeNode(1, node2, node3);
        Solution solution = new Solution();
        int result = solution.maxDepth(root);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void maxDepthModelAnswer() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3, node4, null);
        TreeNode root = new TreeNode(1, node2, node3);
        Solution solution = new Solution();
        int result = solution.maxDepthModelAnswer(root);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void diameterOfBinaryTree() {
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3, node5, null);
        TreeNode node2 = new TreeNode(2, node3, node4);
        TreeNode root = new TreeNode(1, null, node2);
        Solution solution = new Solution();
        int result = solution.diameterOfBinaryTree(root);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void isBalanced() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3, node4, null);
        TreeNode node2 = new TreeNode(2);
        TreeNode root = new TreeNode(1, node2, node3);
        Solution solution = new Solution();
        boolean result = solution.isBalanced(root);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void isSameTree() {
        TreeNode pNode3 = new TreeNode(3);
        TreeNode pNode2 = new TreeNode(2);
        TreeNode p = new TreeNode(1, pNode2, pNode3);

        TreeNode qNode3 = new TreeNode(3);
        TreeNode qNode2 = new TreeNode(2);
        TreeNode q = new TreeNode(1, qNode2, qNode3);
        Solution solution = new Solution();
        boolean result = solution.isSameTree(p, q);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void isSubtree() {
        TreeNode pNode5 = new TreeNode(5);
        TreeNode pNode4 = new TreeNode(4);
        TreeNode pNode3 = new TreeNode(3);
        TreeNode pNode2 = new TreeNode(2, pNode4, pNode5);
        TreeNode p = new TreeNode(1, pNode2, pNode3);

        TreeNode qNode5 = new TreeNode(5);
        TreeNode qNode4 = new TreeNode(4);
        TreeNode q = new TreeNode(2, qNode4, qNode5);
        Solution solution = new Solution();
        boolean result = solution.isSubtree(p, q);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    public void lowestCommonAncestor() {
        Solution solution = new Solution();
        TreeNode node2 = new TreeNode(2);
        TreeNode node9 = new TreeNode(9);
        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1, null, node2);
        TreeNode node8 = new TreeNode(8, node7, node9);
        TreeNode node3 = new TreeNode(3, node1, node4);
        TreeNode node5 = new TreeNode(5, node3, node8);
        TreeNode result = solution.lowestCommonAncestor(node5, node3, node8);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result.val);
    }
}