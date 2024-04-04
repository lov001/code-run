package leetcode.tree.binarytree.problem145;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import leetcode.tree.BinaryTreeNode;

public class PostOrderTraversalUsingIterativeApproach {

    public List<Integer> postorderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            BinaryTreeNode curr = stack.pop();
            list.add(curr.val);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
