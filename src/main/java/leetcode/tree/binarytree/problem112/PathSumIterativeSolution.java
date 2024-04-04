package leetcode.tree.binarytree.problem112;

import java.util.Stack;
import leetcode.tree.BinaryTreeNode;

public class PathSumIterativeSolution {


    public boolean hasPathSum(BinaryTreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Stack<BinaryTreeNode> path = new Stack<>();
        Stack<Integer> sub = new Stack<>();
        path.push(root);
        sub.push(root.val);
        while (!path.isEmpty()) {
            BinaryTreeNode temp = path.pop();
            int tempVal = sub.pop();
            if (temp.left == null && temp.right == null) {
                if (tempVal == targetSum) {
                    return true;
                }
            } else {
                if (temp.left != null) {
                    path.push(temp.left);
                    sub.push(temp.left.val + tempVal);
                }
                if (temp.right != null) {
                    path.push(temp.right);
                    sub.push(temp.right.val + tempVal);
                }
            }
        }
        return false;
    }
}
