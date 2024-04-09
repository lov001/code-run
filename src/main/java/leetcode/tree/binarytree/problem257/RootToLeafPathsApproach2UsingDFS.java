package leetcode.tree.binarytree.problem257;

import java.util.ArrayList;
import java.util.List;
import leetcode.tree.BinaryTreeNode;

public class RootToLeafPathsApproach2UsingDFS {

    public List<String> binaryTreePaths(BinaryTreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        dfs(root, "", paths);
        return paths;
    }

    private void dfs(BinaryTreeNode node, String path, List<String> paths) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
            return;
        }
        dfs(node.left, path + node.val + "->", paths);
        dfs(node.right, path + node.val + "->", paths);
    }
}
