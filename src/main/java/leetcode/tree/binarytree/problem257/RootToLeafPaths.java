package leetcode.tree.binarytree.problem257;

import java.util.ArrayList;
import java.util.List;
import leetcode.tree.BinaryTreeNode;

public class RootToLeafPaths {

    public List<String> binaryTreePaths(BinaryTreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        traverse(root, "", paths);
        return paths;
    }

    private void traverse(BinaryTreeNode node, String path, List<String> paths) {
        path += node.val;
        if (node.left == null && node.right == null) {
            paths.add(path);
            return;
        }
        if (node.left != null) {
            traverse(node.left, path + "->", paths);
        }
        if (node.right != null) {
            traverse(node.right, path + "->", paths);
        }
    }

}
