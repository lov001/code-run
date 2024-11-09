package practice.trees;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPreOrder {

   public BinaryTreeNode buildBinaryTree(int[] inorder, int[] preorder) {
      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < inorder.length; i++) {
         map.put(inorder[i], i);
      }
      return solve(preorder, 0, preorder.length - 1, 0, inorder.length - 1, map);
   }

   private BinaryTreeNode solve(int[] preorder, int preStart, int preEnd, int inStart, int inEnd,
      Map<Integer, Integer> map) {
      if (preStart > preEnd || inStart > inEnd) {
         return null;
      }
      BinaryTreeNode node = new BinaryTreeNode(preorder[preStart]);
      int inRoot = map.get(node.data);
      int numLeft = inRoot - inStart;
      node.left = solve(preorder, preStart + 1, preStart + numLeft, inStart, inRoot - 1, map);
      node.right = solve(preorder, preStart + numLeft + 1, preEnd, inRoot + 1, inEnd, map);
      return node;
   }

}
