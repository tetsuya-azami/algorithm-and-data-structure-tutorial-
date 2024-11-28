package neetcode.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

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
        if (root == null || p == null || q == null) return null;
        int val = root.val;

        if (Math.max(p.val, q.val) < val) {
            root = root.left;
        } else if (val < Math.min(p.val, q.val)) {
            root = root.right;
        } else {
            return root;
        }

        return lowestCommonAncestor(root, p, q);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        levelOrderDfs(root, 0, results);
        return results;
    }

    private void levelOrderDfs(TreeNode root, int height, List<List<Integer>> results) {
        if (root == null) return;

        List<Integer> elements;
        if (results.size() <= height) {
            elements = new ArrayList<>();
            results.add(elements);
        } else {
            elements = results.get(height);
        }
        elements.add(root.val);
        levelOrderDfs(root.left, height + 1, results);
        levelOrderDfs(root.right, height + 1, results);
    }

    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        return goodNodesDfs(root, root.val);
    }

    private int goodNodesDfs(TreeNode target, int maxValue) {
        if (target == null) return 0;
        int isGoodNode = 0;
        if (target.val >= maxValue) {
            isGoodNode = 1;
            maxValue = target.val;
        }

        return goodNodesDfs(target.left, maxValue) + goodNodesDfs(target.right, maxValue) + isGoodNode;
    }

    public int goodNodesBfs(TreeNode root) {
        int count = 0;
        if (root == null) return count;

        Deque<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        queue.add(new Pair<>(root, root.val));
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> target = queue.poll();
            TreeNode node = target.key;
            Integer max = target.value;
            if (max <= node.val) {
                count++;
                max = node.val;
            }
            if (node.left != null) {
                queue.add(new Pair<>(node.left, max));
            }
            if (node.right != null) {
                queue.add(new Pair<>(node.right, max));
            }
        }

        return count;
    }

    record Pair<K, V>(K key, V value) {

    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValid(TreeNode target, int leftBound, int rightBound) {
        if (target == null) return true;
        if (!(leftBound < target.val && target.val < rightBound)) return false;

        return isValid(target.left, leftBound, target.val) && isValid(target.right, target.val, rightBound);
    }
}