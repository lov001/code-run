package practice.utils;

import practice.trees.BinaryTreeNode;

public class SortedArraysToBST {

   public static BinaryTreeNode transformArrayToBST(int[] array) {
      return helper(array, 0, array.length - 1);
   }

   private static BinaryTreeNode helper(int[] array, int start, int end) {
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
