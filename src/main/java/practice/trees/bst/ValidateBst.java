package practice.trees.bst;

import java.util.Arrays;
import practice.trees.BinaryTreeNode;

public class ValidateBst {

   public boolean validateBST(BinaryTreeNode root) {
      if (root == null) {
         return true;
      }
      int[] range = {Integer.MIN_VALUE, Integer.MAX_VALUE};
      return helper(root, range);
   }

   private boolean helper(BinaryTreeNode node, int[] range) {
      if (node == null) {
         return true;
      }
      if (node.data >= range[0] && node.data < range[1]) {
         int[] leftCopy = Arrays.copyOf(range, range.length);
         leftCopy[1] = node.data;
         boolean left = helper(node.left, leftCopy);
         int[] rightCopy = Arrays.copyOf(range, range.length);
         rightCopy[0] = node.data;
         boolean right = helper(node.right, rightCopy);
         return left && right;
      } else {
         return false;
      }
   }
}
