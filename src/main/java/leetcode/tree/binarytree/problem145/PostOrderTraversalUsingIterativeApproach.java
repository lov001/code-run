package leetcode.tree.binarytree.problem145;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import leetcode.tree.TreeNode;

public class PostOrderTraversalUsingIterativeApproach {

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode curr = stack.pop();
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
