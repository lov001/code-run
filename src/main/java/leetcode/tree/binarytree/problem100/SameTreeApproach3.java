package leetcode.tree.binarytree.problem100;

import leetcode.tree.TreeNode;

public class SameTreeApproach3 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        if (p.getVal() == q.getVal()) {
            return isSameTree(p.getLeft(), q.getLeft()) && isSameTree(p.getRight(), q.getRight());
        }
        return false;
    }
}
