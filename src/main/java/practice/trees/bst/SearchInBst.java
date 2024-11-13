package practice.trees.bst;

import practice.trees.BinaryTreeNode;

public class SearchInBst {

   public boolean searchInBST(BinaryTreeNode root, int x) {
      if (root == null) {
         return false;
      }
      while (root != null) {
         if (root.data == x) {
            return true;
         }
         if (x < root.data) {
            root = root.left;
         } else {
            root = root.right;
         }
      }
      return false;
   }
}
