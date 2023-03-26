package leetcode.tree.binarytree.problem112;

import leetcode.tree.TreeNode;

public class PathSum {

    private static boolean flag;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        flag = false;
        sum(root, targetSum);
        return flag;
    }

    private void sum(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        int sum = targetSum - root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            flag = true;
        }
        sum(root.left, sum);
        sum(root.right, sum);
    }
}
