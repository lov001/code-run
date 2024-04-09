package leetcode.tree.binarytree.problem144;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import leetcode.tree.BinaryTreeNode;

public class PreOrderTraversalUsingIterativeApproach {

    public List<Integer> preorderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }
}
