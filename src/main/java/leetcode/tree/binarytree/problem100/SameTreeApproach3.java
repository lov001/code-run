package leetcode.tree.binarytree.problem100;

import leetcode.tree.BinaryTreeNode;

public class SameTreeApproach3 {

    public boolean isSameTree(BinaryTreeNode p, BinaryTreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        if (p.getVal() == q.getVal()) {
            return isSameTree(p.getLeft(), q.getLeft()) && isSameTree(p.getRight(), q.getRight());
        }
        return false;
    }
}
