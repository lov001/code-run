package practice.trees.bst;

import practice.trees.BinaryTreeNode;

public class LCAInBst {

   public BinaryTreeNode LCAinaBST(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
      if (root == null) {
         return null;
      }
      int current = root.data;
      if (current < p.data && current < q.data) {
         return LCAinaBST(root.right, p, q);
      } else if (current > p.data && current > q.data) {
         return LCAinaBST(root.left, p, q);
      }
      return root;
   }
}
