package leetcode.tree.binarysearchtree.problem108;

import leetcode.tree.TreeNode;

public class ArrayToBst {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = (start + end) / 2;
        TreeNode root = new TreeNode(array[middle]);
        root.left = helper(array, start, middle - 1);
        root.right = helper(array, middle + 1, end);
        return root;
    }
}
