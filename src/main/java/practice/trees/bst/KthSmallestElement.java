package practice.trees.bst;

import java.util.ArrayList;
import java.util.List;
import practice.trees.BinaryTreeNode;

public class KthSmallestElement {

   public int kthSmallestOptimised(BinaryTreeNode root, int k) {
      if (root == null) {
         return -1;
      }
      int[] count = {0};
      int[] kthSmallest = {-1};
      traverse(root, k, count, kthSmallest);
      return kthSmallest[0];
   }

   private void traverse(BinaryTreeNode node, int k, int[] count, int[] kthSmallest) {
      if (node == null || count[0] >= k) {
         return;
      }
      traverse(node.left, k, count, kthSmallest);
      count[0]++;
      if (count[0] == k) {
         kthSmallest[0] = node.data;
         return;
      }
      traverse(node.right, k, count, kthSmallest);
   }


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
