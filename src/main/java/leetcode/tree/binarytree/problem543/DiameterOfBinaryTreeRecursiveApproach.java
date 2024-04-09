package leetcode.tree.binarytree.problem543;

import leetcode.tree.BinaryTreeNode;

public class DiameterOfBinaryTreeRecursiveApproach {

    private static int max = 0;

    public int diameterOfBinaryTree(BinaryTreeNode root) {
        depth(root);
        return max;
    }

    public int depth(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
