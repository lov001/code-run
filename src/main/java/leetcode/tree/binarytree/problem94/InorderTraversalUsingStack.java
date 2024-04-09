package leetcode.tree.binarytree.problem94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import leetcode.tree.BinaryTreeNode;

public class InorderTraversalUsingStack {

    public List<Integer> inorderTraversal(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();

        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode cur = root;

        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.getLeft();
            }
            cur = stack.pop();
            list.add(cur.getVal());
            cur = cur.getRight();
        }

        return list;
    }
}
