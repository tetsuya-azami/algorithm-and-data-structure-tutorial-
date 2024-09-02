package neetcode.trees;

import org.junit.jupiter.api.Test;

public class SolutionReTest {
    @Test
    public void invertTree() {
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
    public void maxDepth() {
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
    public void diameterOfBinaryTree() {
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
    public void isSubtree() {
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
}
