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

    public int diameterOfBinaryTree(TreeNode root) {
        int[] result = {0};
        diameterOfBinaryTreeDfs(root, result);

        return result[0];
    }

    private int diameterOfBinaryTreeDfs(TreeNode root, int[] result) {
        if (root == null) {
            return 0;
        }
        int leftDepth = diameterOfBinaryTreeDfs(root.left, result);
        int rightDepth = diameterOfBinaryTreeDfs(root.right, result);

        result[0] = Math.max(result[0], leftDepth + rightDepth);

        return 1 + Math.max(leftDepth, rightDepth);
    }

    public boolean isBalanced(TreeNode root) {
        boolean[] result = {true};
        isBalancedDfs(root, result);

        return result[0];
    }

    private int isBalancedDfs(TreeNode root, boolean[] result) {
        if (root == null) return 0;
        int left = isBalancedDfs(root.left, result);
        int right = isBalancedDfs(root.right, result);
        if (Math.abs(left - right) > 1) result[0] = false;

        return 1 + Math.max(left, right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
