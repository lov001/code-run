package leetcode.tree.binarysearchtree.problem108;

import leetcode.tree.BinaryTreeNode;

public class ArrayToBst {

    public BinaryTreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private BinaryTreeNode helper(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = (start + end) / 2;
        BinaryTreeNode root = new BinaryTreeNode(array[middle]);
        root.left = helper(array, start, middle - 1);
        root.right = helper(array, middle + 1, end);
        return root;
    }
}
