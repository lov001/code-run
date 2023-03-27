package leetcode.tree.binarytree.problem145;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import leetcode.tree.TreeNode;

public class PostOrderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
}
