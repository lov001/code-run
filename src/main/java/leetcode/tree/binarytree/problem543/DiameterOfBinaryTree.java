package leetcode.tree.binarytree.problem543;

import leetcode.tree.BinaryTreeNode;

public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(BinaryTreeNode root) {
        return diameterOfBinaryTreeFast(root)[1];
    }

    public int[] diameterOfBinaryTreeFast(BinaryTreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = diameterOfBinaryTreeFast(root.left);
        int[] right = diameterOfBinaryTreeFast(root.right);
        int height = Math.max(left[0], right[0]) + 1;
        int diameter = Math.max(left[1], Math.max(right[1], left[0] + right[0]));
        return new int[]{height, diameter};
    }
}
