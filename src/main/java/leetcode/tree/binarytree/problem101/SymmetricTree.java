package leetcode.tree.binarytree.problem101;

import leetcode.tree.BinaryTreeNode;

public class SymmetricTree {

    public boolean isSymmetric(BinaryTreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        if (root.left == null || root.right == null) {
            return false;
        }
        return isSymmetricHelper(root.left, root.right);
    }

    private boolean isSymmetricHelper(BinaryTreeNode left, BinaryTreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right,
            right.left);
    }
}
