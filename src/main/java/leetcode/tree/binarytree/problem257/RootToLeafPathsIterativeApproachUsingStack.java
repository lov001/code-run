package leetcode.tree.binarytree.problem257;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import leetcode.tree.BinaryTreeNode;

public class RootToLeafPathsIterativeApproachUsingStack {

    public List<String> binaryTreePaths(BinaryTreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<BinaryTreeNode> nodeStack = new Stack<>();
        Stack<String> pathStack = new Stack<>();
        nodeStack.push(root);
        pathStack.push(String.valueOf(root.val));
        while (!nodeStack.isEmpty()) {
            BinaryTreeNode current = nodeStack.pop();
            String currentPath = pathStack.pop();
            if (current.left == null && current.right == null) {
                result.add(currentPath);
            }
            if (current.right != null) {
                nodeStack.push(current.right);
                pathStack.push(currentPath + "->" + current.right.val);
            }
            if (current.left != null) {
                nodeStack.push(current.left);
                pathStack.push(currentPath + "->" + current.left.val);
            }
        }
        return result;
    }
}
