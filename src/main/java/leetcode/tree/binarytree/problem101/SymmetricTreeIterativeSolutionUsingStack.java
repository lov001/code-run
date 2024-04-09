package leetcode.tree.binarytree.problem101;

import java.util.Stack;
import leetcode.tree.BinaryTreeNode;

public class SymmetricTreeIterativeSolutionUsingStack {

    public boolean isSymmetric(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()) {
            BinaryTreeNode right = stack.pop();
            BinaryTreeNode left = stack.pop();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null || left.val != right.val) {
                return false;
            }
            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
        }
        return true;
    }
}
