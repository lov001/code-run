package leetcode.tree.binarytree.problem404;

import leetcode.tree.BinaryTreeNode;

public class LeftLeavesSumRecursiveApproach {

    public int sumOfLeftLeaves(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                ans += root.left.val;
            } else {
                ans += sumOfLeftLeaves(root.left);
            }
        }
        ans += sumOfLeftLeaves(root.right);
        return ans;
    }
}
