package leetcode.tree.binarytree.problem110;

import leetcode.tree.BinaryTreeNode;

public class BalancedBinaryTree {

    public boolean isBalanced(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(traverse(root.left) - traverse(root.right)) <= 1 && isBalanced(root.left)
            && isBalanced(root.right);
    }

    private int traverse(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = traverse(root.left);
        int right = traverse(root.right);
        return 1 + Math.max(left, right);
    }
}
