package leetcode.tree.binarytree.problem404;

import leetcode.tree.BinaryTreeNode;

public class LeftLeavesSumRecursiveApproach2 {

    public int sumOfLeftLeaves(BinaryTreeNode root) {
        return dfs(root, false);
    }

    private int dfs(BinaryTreeNode root, boolean isLeft) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return isLeft ? root.val : 0;
        }
        return dfs(root.left, true) + dfs(root.right, false);
    }
}
