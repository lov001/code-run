package leetcode.tree.binarytree.problem104;

import leetcode.tree.BinaryTreeNode;

public class BinaryTreeDepth {


    public int maxDepth(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
