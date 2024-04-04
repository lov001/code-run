package leetcode.tree.binarytree.problem100;

import java.util.ArrayList;
import java.util.List;
import leetcode.tree.BinaryTreeNode;

public class SameTree {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public boolean isSameTree(BinaryTreeNode p, BinaryTreeNode q) {
        inorderTraversal(p, list1);
        inorderTraversal(q, list2);
        return list1.equals(list2);
    }

    private void inorderTraversal(BinaryTreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.getLeft(), list);
        list.add(root.getVal());
        inorderTraversal(root.getRight(), list);
    }
}
