package neetcode.trees;

import java.util.*;

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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (subRoot == null) return true;
        if (root.val == subRoot.val) {
            if (isSameTree(root, subRoot)) return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else {
                return root;
            }
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root != null) queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> sameHeightNodes = new LinkedList<>();
            result.add(sameHeightNodes);
            for (int i = 0, len = queue.size(); i < len; i++) {
                TreeNode node = queue.poll();
                sameHeightNodes.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return result;
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return result;
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = 0, length = queue.size(); i < length; i++) {
                TreeNode node = queue.pop();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (i == length - 1) {
                    result.add(node.val);
                }
            }
        }

        return result;
    }

    public int goodNodes(TreeNode root) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int[] result = {0};
        queue.add(root.val - 1);
        goodNodesDfs(root, queue, result);

        return result[0];
    }

    private void goodNodesDfs(TreeNode node, Queue<Integer> priorityQueue, int[] result) {
        if (priorityQueue.peek() <= node.val) result[0]++;
        priorityQueue.add(node.val);
        if (node.left != null) {
            goodNodesDfs(node.left, priorityQueue, result);
        }
        if (node.right != null) {
            goodNodesDfs(node.right, priorityQueue, result);
        }
        priorityQueue.remove(node.val);
    }
}