package leetcode.tree.binarytree.problem104;

import java.util.Stack;
import leetcode.tree.BinaryTreeNode;

public class BinaryTreeDepthIterativeApproachUsingStack {


    public int maxDepth(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();
        stack.push(root);
        value.push(1);
        int depth = 0;
        while (!stack.isEmpty()) {
            BinaryTreeNode node = stack.pop();
            int temp = value.pop();
            depth = Math.max(temp, depth);
            if (node.left != null) {
                stack.push(node.left);
                value.push(temp + 1);
            }
            if (node.right != null) {
                stack.push(node.right);
                value.push(temp + 1);
            }
        }
        return depth;
    }
}
