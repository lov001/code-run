package practice.trees.bst;

import practice.trees.BinaryTreeNode;

public class RecoverBst {

   public BinaryTreeNode fixBST(BinaryTreeNode root) {
      BinaryTreeNode[] nodes = new BinaryTreeNode[4];
      nodes[3] = new BinaryTreeNode(Integer.MIN_VALUE);
      inorder(root, nodes);
      if (nodes[0] != null && nodes[2] != null) {
         int temp = nodes[0].data;
         nodes[0].data = nodes[2].data;
         nodes[2].data = temp;
      } else if (nodes[0] != null && nodes[1] != null) {
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
      if (nodes[3] != null && node.data < nodes[3].data) {
         if (nodes[0] == null) {
            nodes[0] = nodes[3];
            nodes[1] = node;
         } else {
            nodes[2] = node;
         }
      }
      nodes[3] = node;
      inorder(node.right, nodes);
   }
}
