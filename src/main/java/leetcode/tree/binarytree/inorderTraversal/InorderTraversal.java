package leetcode.tree.binarytree.inorderTraversal;

import java.util.ArrayList;
import java.util.List;
import leetcode.tree.TreeNode;

public class InorderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> printList(TreeNode root) {
        inorderTraversal(root);
        return list;
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.getLeft());
        list.add(root.getVal());
        System.out.println(root.getVal() + " - ");
        inorderTraversal(root.getRight());
    }
}
