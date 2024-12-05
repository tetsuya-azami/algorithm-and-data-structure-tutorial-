package neetcode.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

class SolutionReTest {
    @Test
    void invertTree() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode root = new TreeNode(1, node2, node3);
        SolutionRe solutionRe = new SolutionRe();
        TreeNode result = solutionRe.invertTree(root);
        printTreeNode(result);
    }

    private void printTreeNode(TreeNode treeNode) {
        if (treeNode == null) return;
        System.out.println(treeNode.val);
        printTreeNode(treeNode.left);
        printTreeNode(treeNode.right);
    }

    @Test
    void maxDepth() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3, node4, null);
        TreeNode root = new TreeNode(1, node2, node3);
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.maxDepth(root);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void diameterOfBinaryTree() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3, node4, null);
        TreeNode root = new TreeNode(1, node2, node3);
        SolutionRe solutionRe = new SolutionRe();
        int result = solutionRe.diameterOfBinaryTree(root);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void isSubtree() {
        TreeNode pNode5 = new TreeNode(5);
        TreeNode pNode4 = new TreeNode(4);
        TreeNode pNode3 = new TreeNode(3);
        TreeNode pNode2 = new TreeNode(2, pNode4, pNode5);
        TreeNode p = new TreeNode(1, pNode2, pNode3);

        TreeNode qNode5 = new TreeNode(5);
        TreeNode qNode4 = new TreeNode(4);
        TreeNode q = new TreeNode(2, qNode4, qNode5);
        SolutionRe solutionRe = new SolutionRe();
        boolean result = solutionRe.isSubtree(p, q);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void lowestCommonAncestor() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2, node1, null);
        TreeNode result = solutionRe.lowestCommonAncestor(node2, node2, node1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result.val);
    }

    @Test
    void lowestCommonAncestor2() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, null, node3);
        TreeNode result = solutionRe.lowestCommonAncestor(node2, node3, node2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result.val);
    }

    @Test
    void lowestCommonAncestor3() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, node3);
        TreeNode result = solutionRe.lowestCommonAncestor(node2, node3, node1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result.val);
    }

    @Test
    void levelOrder() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        List<List<Integer>> result = solutionRe.levelOrder(node1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void goodNodes() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3_right = new TreeNode(3);
        TreeNode node4 = new TreeNode(4, node1, node5);
        TreeNode node3_left = new TreeNode(1, node3_right, null);
        TreeNode root = new TreeNode(3, node3_left, node4);
        int result = solutionRe.goodNodes(root);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void goodNodesBfs() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3_right = new TreeNode(3);
        TreeNode node4 = new TreeNode(4, node1, node5);
        TreeNode node3_left = new TreeNode(1, node3_right, null);
        TreeNode root = new TreeNode(3, node3_left, node4);
        int result = solutionRe.goodNodesBfs(root);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void isValidBST() {
        SolutionRe solution = new SolutionRe();
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, node3);

        boolean result = solution.isValidBST(node2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void isValidBSTBfs() {
        SolutionRe solution = new SolutionRe();
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, node3);

        boolean result = solution.isValidBSTBfs(node2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void kthSmallest() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode node2 = new TreeNode(2);
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3, node2, null);
        TreeNode node4 = new TreeNode(4, node3, node5);

        int result = solutionRe.kthSmallest(node4, 4);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void kthSmallestInorderTraversal() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode node2 = new TreeNode(2);
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3, node2, null);
        TreeNode node4 = new TreeNode(4, node3, node5);

        int result = solutionRe.kthSmallestInorderTraversal(node4, 4);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void kthSmallestUsingStack() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode node2 = new TreeNode(2);
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3, node2, null);
        TreeNode node4 = new TreeNode(4, node3, node5);

        int result = solutionRe.kthSmallestUsingStack(node4, 4);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void kthSmallestUsingStack2() {
        SolutionRe solutionRe = new SolutionRe();

        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2, node1, node3);

        int result = solutionRe.kthSmallestUsingStack(node2, 1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }

    @Test
    void buildTree() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode result = solutionRe.buildTree(new int[]{1, 2, 3, 4}, new int[]{2, 1, 3, 4});
        System.out.println();
        System.out.println();
        System.out.println();
        printNodes(result);
        System.out.println();
    }

    private void printNodes(TreeNode node) {
        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode target = queue.poll();
            System.out.println(target.val);
            if (target.left != null) {
                queue.add(target.left);
            }
            if (target.right != null) {
                queue.add(target.right);
            }
        }
    }

    @Test
    public void buildTreeUsingHashMap() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode result = solutionRe.buildTreeUsingHashMap(new int[]{1, 2, 3, 4}, new int[]{2, 1, 3, 4});
        System.out.println();
        System.out.println();
        System.out.println();
        printNodes(result);
        System.out.println();
    }

    @Test
    public void buildTreeOptimal() {
        SolutionRe solutionRe = new SolutionRe();
        TreeNode result = solutionRe.buildTreeOptimal(new int[]{1, 2, 3, 4}, new int[]{2, 1, 3, 4});
        System.out.println();
        System.out.println();
        System.out.println();
        printNodes(result);
        System.out.println();
    }
}