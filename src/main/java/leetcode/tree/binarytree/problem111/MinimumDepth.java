package leetcode.tree.binarytree.problem111;

import leetcode.tree.TreeNode;

public class MinimumDepth {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        int leftHeight = minDepth(root.left);
        int rightHeight = minDepth(root.right);
        return 1 + Math.min(leftHeight, rightHeight);
    }
}
