package neetcode.trees;

import java.util.*;

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

    public boolean isValidBSTBfs(TreeNode root) {
        if (root == null) return true;

        Deque<Triple> queue = new ArrayDeque<>();
        queue.offer(new Triple(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        while (!queue.isEmpty()) {
            Triple entry = queue.poll();
            TreeNode node = entry.node;
            if (node.val <= entry.leftBound || entry.rightBound <= node.val) return false;
            if (node.left != null) queue.offer(new Triple(node.left, entry.leftBound, node.val));
            if (node.right != null) queue.offer(new Triple(node.right, node.val, entry.rightBound));
        }

        return true;
    }

    record Triple(TreeNode node, int leftBound, int rightBound) {
    }

    public int kthSmallest(TreeNode root, int k) {
        return kthSmallestDfs(root, new int[]{0}, k);
    }

    private int kthSmallestDfs(TreeNode current, int[] count, int k) {
        if (current == null) return -1;
        int leftResult = kthSmallestDfs(current.left, count, k);
        if (leftResult != -1) return leftResult;

        count[0]++;
        if (count[0] == k) {
            return current.val;
        }

        return kthSmallestDfs(current.right, count, k);
    }

    public int kthSmallestInorderTraversal(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        kthSmallestInorderTraversalRec(root, list);
        return list.get(k - 1);
    }

    private void kthSmallestInorderTraversalRec(TreeNode node, List<Integer> list) {
        if (node == null) return;
        kthSmallestInorderTraversalRec(node.left, list);

        list.add(node.val);

        kthSmallestInorderTraversalRec(node.right, list);
    }

    public int kthSmallestUsingStack(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        int count = 0;
        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pollFirst();

            count++;
            if (count == k) {
                return cur.val;
            }

            cur = cur.right;
        }

        return -1;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);

        int mid = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                mid = i;
                break;
            }
        }

        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, mid + 1);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, mid);
        root.left = buildTree(leftPreorder, leftInorder);

        int[] rightPreorder = Arrays.copyOfRange(preorder, mid + 1, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, mid + 1, inorder.length);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }

    private Map<Integer, Integer> indices = new HashMap<>();
    private int preIndex = 0;

    public TreeNode buildTreeUsingHashMap(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indices.put(inorder[i], i);
        }

        return buildTreeUsingHashMapDfs(preorder, 0, preorder.length - 1);
    }

    private TreeNode buildTreeUsingHashMapDfs(int[] preorder, int left, int right) {
        if (left > right) return null;
        int rootValue = preorder[preIndex++];
        TreeNode root = new TreeNode(rootValue);
        int rootIndex = indices.get(rootValue);
        root.left = buildTreeUsingHashMapDfs(preorder, left, rootIndex - 1);
        root.right = buildTreeUsingHashMapDfs(preorder, rootIndex + 1, right);

        return root;
    }

    public TreeNode buildTreeOptimal(int[] preorder, int[] inorder) {
        int[] preIndex = new int[]{0};
        int[] inIndex = new int[]{0};
        return buildTreeOptimalDfs(preorder, inorder, preIndex, inIndex, Integer.MAX_VALUE);
    }

    private TreeNode buildTreeOptimalDfs(int[] preorder, int[] inorder, int[] preIndex, int[] inIndex, int limit) {
        if (preIndex[0] >= preorder.length) return null;

        if (inorder[inIndex[0]] == limit) {
            inIndex[0]++;
            return null;
        }

        int rootVal = preorder[preIndex[0]++];
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTreeOptimalDfs(preorder, inorder, preIndex, inIndex, rootVal);
        root.right = buildTreeOptimalDfs(preorder, inorder, preIndex, inIndex, limit);

        return root;
    }
}