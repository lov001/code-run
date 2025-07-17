package practice.trees;

public class LongestConsecutiveSequence {

   private int maxLength = 0;

   public int LongestConsecutiveSequenceLength(BinaryTreeNode root) {
      if (root == null) {
         return 0;
      }
      helper(root, null, 0);
      return maxLength;
   }

   private void helper(BinaryTreeNode node, BinaryTreeNode parent, int currentLength) {
      if (node == null) {
         return;
      }
      if (parent != null && node.data == parent.data + 1) {
         currentLength++;
      } else {
         currentLength = 1;
      }
      maxLength = Math.max(maxLength, currentLength);
      helper(node.left, node, currentLength);
      helper(node.right, node, currentLength);
   }
}
