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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;
        if (isSubtreeDfs(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSubtreeDfs(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        if (root.val != subRoot.val) return false;
        return isSubtreeDfs(root.left, subRoot.left) && isSubtreeDfs(root.right, subRoot.right);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowestCommonAncestorDfs(root, p, q);
    }

    private TreeNode lowestCommonAncestorDfs(TreeNode root, TreeNode p, TreeNode q) {
        int val = root.val;

        if (Math.min(p.val, q.val) <= val && val <= Math.max(p.val, q.val)) return root;
        if (root.left == null || root.right == null) return root;
        if (Math.max(p.val, q.val) < val) {
            root = root.left;
        } else {
            root = root.right;
        }
        
        return lowestCommonAncestorDfs(root, p, q);
    }
}