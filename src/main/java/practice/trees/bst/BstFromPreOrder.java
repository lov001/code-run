package practice.trees.bst;

import java.util.ArrayList;
import practice.trees.BinaryTreeNode;

public class BstFromPreOrder {

   public BinaryTreeNode proOderToBST(ArrayList<Integer> preorder) {
      int[] index = {0};
      return traverse(preorder, Integer.MAX_VALUE, index);
   }

   private BinaryTreeNode traverse(ArrayList<Integer> preorder, int maxValue, int[] index) {
      if (index[0] == preorder.size() || preorder.get(index[0]) > maxValue) {
         return null;
      }
      BinaryTreeNode root = new BinaryTreeNode(preorder.get(index[0]++));
      root.left = traverse(preorder, root.data, index);
      root.right = traverse(preorder, maxValue, index);
      return root;
   }
}
