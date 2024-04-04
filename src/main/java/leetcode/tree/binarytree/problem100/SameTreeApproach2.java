package leetcode.tree.binarytree.problem100;

import leetcode.tree.BinaryTreeNode;

public class SameTreeApproach2 {

    boolean flag = true;

    public boolean isSameTree(BinaryTreeNode p, BinaryTreeNode q) {
        inorderTraversal2(p, q);
        return flag;
    }

    private void inorderTraversal2(BinaryTreeNode root1, BinaryTreeNode root2) {
        if ((root1 == null && root2 != null) || (root1 != null && root2 == null)) {
            flag = false;
        } else if (root1 == null) {
            return;
        }
        if (!flag) {
            return;
        }
        inorderTraversal2(root1.getLeft(), root2.getLeft());
        if (root1.getVal() != root2.getVal()) {
            flag = false;
        }
        inorderTraversal2(root1.getRight(), root2.getRight());
    }
}
