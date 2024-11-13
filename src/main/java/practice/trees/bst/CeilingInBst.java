package practice.trees.bst;

import practice.trees.BinaryTreeNode;

public class CeilingInBst {

   public int findCeil(BinaryTreeNode node, int x) {
      int ceil = -1;
      while (node != null) {
         if (node.data == x) {
            ceil = node.data;
            return ceil;
         }
         if (x > node.data) {
            node = node.right;
         } else {
            ceil = node.data;
            node = node.left;
         }
      }
      return ceil;
   }
}
