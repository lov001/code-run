package leetcode.tree.binarytree.problem226;

import java.util.Stack;
import leetcode.tree.BinaryTreeNode;

public class InvertBinaryTreeIterativeApproach {

    public BinaryTreeNode invertTree(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            BinaryTreeNode node = stack.pop();
            if (node.left == null && node.right == null) {
                continue;
            } else {
                BinaryTreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }
}
