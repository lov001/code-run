package leetcode.tree.binarytree.problem563;

import leetcode.tree.BinaryTreeNode;

public class TiltSum {

    private int sum = 0;

    public int findTilt(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        traverse(root);
        return sum;
    }

    private int traverse(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = traverse(root.left);
        int rightSum = traverse(root.right);
        sum += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }
}
