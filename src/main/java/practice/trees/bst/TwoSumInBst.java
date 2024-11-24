package practice.trees.bst;

import practice.trees.BinaryTreeNode;

public class TwoSumInBst {

   public boolean twoSumInBST(BinaryTreeNode root, int target) {
      BstIterator iterator = new BstIterator(root);
      int left = iterator.next();
      int right = iterator.before();
      while (left != -1 && right != -1) {
         int current = left + right;
         if (current == target) {
            return true;
         } else if (current < target) {
            left = iterator.next();
         } else {
            right = iterator.before();
         }
      }
      return false;
   }
}
