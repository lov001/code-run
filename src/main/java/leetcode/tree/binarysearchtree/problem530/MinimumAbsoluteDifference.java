package leetcode.tree.binarysearchtree.problem530;

import java.util.ArrayList;
import java.util.List;
import leetcode.tree.TreeNode;

public class MinimumAbsoluteDifference {

    List<Integer> list = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        traverse(root);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, Math.abs(list.get(i - 1) - list.get(i)));
        }
        return min;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}
