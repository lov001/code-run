package practice.trees.bst;

import practice.trees.BinaryTreeNode;

public class RecoverBst {

   public BinaryTreeNode fixBST(BinaryTreeNode root) {
      BinaryTreeNode[] nodes = new BinaryTreeNode[3];
      inorder(root, nodes);
      if (nodes[0] != null && nodes[1] != null) {
         int temp = nodes[0].data;
         nodes[0].data = nodes[1].data;
         nodes[1].data = temp;
      }
      return root;
   }

   private void inorder(BinaryTreeNode node, BinaryTreeNode[] nodes) {
      if (node == null) {
         return;
      }
      inorder(node.left, nodes);
      if (nodes[2] != null && node.data < nodes[2].data) {
         if (nodes[0] == null) {
            nodes[0] = nodes[2];
            nodes[1] = node;
         } else {
            nodes[1] = node;
         }
      }
      nodes[2] = node;
      inorder(node.right, nodes);
   }
}
