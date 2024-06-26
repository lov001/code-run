package leetcode.tree.binarytree.problem110;

import leetcode.tree.BinaryTreeNode;

public class BalancedBinaryTreeApproach2 {

    public boolean isBalanced(BinaryTreeNode root) {
        return height(root) != -1;
    }

    private int height(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = height(node.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
