package leetcode.tree.binarysearchtree.problem700;

import leetcode.tree.TreeNode;

public class SearchTargetInBST {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        while (root != null) {
            if (root.val == val) {
                return root;
            }
            if (root.val > val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return null;
    }
}
