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
        return goodNodesDfs(root, root.val);
    }

    private int goodNodesDfs(TreeNode node, int max) {
        if (node == null) return 0;
        int isGoodNode = 0;

        if (max <= node.val) isGoodNode = 1;
        max = Math.max(max, node.val);
        return goodNodesDfs(node.left, max) + goodNodesDfs(node.right, max) + isGoodNode;
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBSTDfs(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    private boolean isValidBSTDfs(TreeNode node, double left, double right) {
        if (node == null) return true;
        if (!(left < node.val && node.val < right)) return false;

        return isValidBSTDfs(node.left, left, node.val) && isValidBSTDfs(node.right, node.val, right);
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> array = new ArrayList<>();
        kthSmallestDfs(root, array);
        return array.get(k - 1);
    }

    private void kthSmallestDfs(TreeNode node, List<Integer> list) {
        if (node == null) return;

        kthSmallestDfs(node.left, list);
        list.add(node.val);
        kthSmallestDfs(node.right, list);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int middle = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                middle = i;
                break;
            }
        }

        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, middle + 1);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, middle);
        root.left = buildTree(leftPreorder, leftInorder);

        int[] rightPreorder = Arrays.copyOfRange(preorder, middle + 1, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, middle + 1, inorder.length);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }

    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][];
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparing(e -> e[0]));
        for (int[] point : points) {
            int distance = point[0] * point[0] + point[1] * point[1];
            queue.add(new int[]{distance, point[0], point[1]});
        }

        for (int i = 0; i < k; i++) {
            int[] point = queue.poll();
            result[i] = new int[]{point[1], point[2]};
        }

        return result;
    }
}