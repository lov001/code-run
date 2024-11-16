package practice.trees.bst;

import java.util.ArrayList;
import java.util.List;
import practice.trees.BinaryTreeNode;

public class KthLargestElement {

   public int kthLargestOptimised(BinaryTreeNode root, int k) {
      if (root == null) {
         return -1;
      }
      int[] count = {0};
      int[] kthLargest = {-1};
      traverse(root, k, count, kthLargest);
      return kthLargest[0];
   }

   private void traverse(BinaryTreeNode node, int k, int[] count, int[] kthLargest) {
      if (node == null || count[0] >= k) {
         return;
      }
      traverse(node.right, k, count, kthLargest);
      count[0]++;
      if (count[0] == k) {
         kthLargest[0] = node.data;
         return;
      }
      traverse(node.left, k, count, kthLargest);
   }

   public int kthLargest(BinaryTreeNode root, int k) {
      if (root == null) {
         return -1;
      }
      List<Integer> list = new ArrayList<>();
      traverse(root, list);
      if (k > list.size()) {
         return -1;
      }
      return list.get(list.size() - k);
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
