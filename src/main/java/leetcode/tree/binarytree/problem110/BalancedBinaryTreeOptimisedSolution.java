package leetcode.tree.binarytree.problem110;

import leetcode.tree.BinaryTreeNode;

public class BalancedBinaryTreeOptimisedSolution {

    public boolean isBalanced(BinaryTreeNode root) {
        return helper(root)[0] == 0;
    }

    private int[] helper(BinaryTreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int[] leftSubTree = helper(root.left);
        int[] rightSubtree = helper(root.right);

        boolean left = leftSubTree[0] == 0;
        boolean right = rightSubtree[0] == 0;
        boolean third = Math.abs(leftSubTree[1] - rightSubtree[1]) <= 1;

        int[] pair = new int[2];
        if (!(left && right && third)) {
            pair[0] = 1;
        }
        pair[1] = Math.max(leftSubTree[1], rightSubtree[1]) + 1;
        return pair;
    }
}
