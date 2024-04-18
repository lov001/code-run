package practice.trees;

public class MinimalTree {

   public BinaryTreeNode minimalTree(int[] array) {
      return helper(array, 0, array.length - 1);
   }

   private BinaryTreeNode helper(int[] array, int start, int end) {
      if (end < start) {
         return null;
      }
      int middle = (start + end) / 2;
      BinaryTreeNode root = new BinaryTreeNode(array[middle]);
      root.left = helper(array, start, middle - 1);
      root.right = helper(array, middle + 1, end);
      return root;
   }
}
