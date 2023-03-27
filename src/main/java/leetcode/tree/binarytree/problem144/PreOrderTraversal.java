package leetcode.tree.binarytree.problem144;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import leetcode.tree.TreeNode;

public class PreOrderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
