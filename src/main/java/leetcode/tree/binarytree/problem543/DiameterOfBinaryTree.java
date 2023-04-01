package leetcode.tree.binarytree.problem543;

import leetcode.tree.TreeNode;

public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        return traverse(root.left) + traverse(root.right);
    }

    private int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = traverse(root.left);
        int right = traverse(root.right);
        return Math.max(left, right) + 1;
    }
}
