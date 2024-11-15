package practice.trees.bst;

import java.util.ArrayList;
import java.util.List;
import practice.trees.BinaryTreeNode;

public class KthSmallestElement {


   public int kthSmallest(BinaryTreeNode root, int k) {
      if (root == null) {
         return -1;
      }
      List<Integer> list = new ArrayList<>();
      traverse(root, list);
      if (k > list.size()) {
         return -1;
      }
      return list.get(k - 1);
   }

   private void traverse(BinaryTreeNode node, List<Integer> list) {
      if (node == null) {
         return;
      }
      traverse(node.left, list);
      list.add(node.data);
      traverse(node.right, list);
   }
}
