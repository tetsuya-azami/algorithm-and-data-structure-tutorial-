package neetcode.trees;

public class SolutionRe {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] result = new int[1];
        dfsDiameterOfBinaryTree(root, result);
        return result[0];
    }

    private int dfsDiameterOfBinaryTree(TreeNode node, int[] result) {
        if (node == null) return 0;
        int left = dfsDiameterOfBinaryTree(node.left, result);
        int right = dfsDiameterOfBinaryTree(node.right, result);
        int diameter = left + right;
        result[0] = Math.max(result[0], diameter);

        return Math.max(left, right) + 1;
    }
}
