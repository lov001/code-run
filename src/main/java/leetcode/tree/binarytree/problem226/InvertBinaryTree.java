package leetcode.tree.binarytree.problem226;

import leetcode.tree.BinaryTreeNode;

public class InvertBinaryTree {

    public BinaryTreeNode invertTree(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        BinaryTreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        return root;
    }
}
