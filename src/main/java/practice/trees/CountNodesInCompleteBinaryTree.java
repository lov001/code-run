package practice.trees;

public class CountNodesInCompleteBinaryTree {

   public int countNodes(BinaryTreeNode root) {
      if (root == null) {
         return 0;
      }
      int lh = getLeftHeight(root);
      int rh = getRightHeight(root);
      if (lh == rh) {
         return (2 << lh) - 1;
      }
      return 1 + countNodes(root.left) + countNodes(root.right);
   }

   private int getLeftHeight(BinaryTreeNode node) {
      if (node == null) {
         return 0;
      }
      int count = 0;
      while (node.left != null) {
         count++;
         node = node.left;
      }
      return count;
   }

   private int getRightHeight(BinaryTreeNode node) {
      if (node == null) {
         return 0;
      }
      int count = 0;
      while (node.right != null) {
         count++;
         node = node.right;
      }
      return count;
   }
}
