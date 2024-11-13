package practice.trees.bst;

import practice.trees.BinaryTreeNode;

public class FloorInBst {

   public int floorInBST(BinaryTreeNode node, int x) {
      int floor = -1;
      while (node != null) {
         if (x < node.data) {
            node = node.left;
         } else {
            floor = node.data;
            node = node.right;
         }
      }
      return floor;
   }
}
