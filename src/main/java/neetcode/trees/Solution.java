package neetcode.trees;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = invertTree(right);
        root.right = invertTree(left);

        return root;
    }

    public int maxDepth(TreeNode root) {
        return calculateDepth(root, 0);
    }

    private int calculateDepth(TreeNode node, int depth) {
        if (node == null) return depth;
        depth++;
        return Math.max(calculateDepth(node.left, depth), calculateDepth(node.right, depth
        ));
    }

    public int maxDepthModelAnswer(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepthModelAnswer(root.left), maxDepthModelAnswer(root.right));
    }
}
