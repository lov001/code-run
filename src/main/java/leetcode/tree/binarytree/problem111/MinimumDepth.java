package leetcode.tree.binarytree.problem111;

import leetcode.tree.TreeNode;

public class MinimumDepth {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == 0 && rightHeight != 0) {
            return rightHeight + 1;
        }
        if (leftHeight != 0 && rightHeight == 0) {
            return leftHeight + 1;
        }
        return 1 + Math.min(leftHeight, rightHeight);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left, right);
    }
}
