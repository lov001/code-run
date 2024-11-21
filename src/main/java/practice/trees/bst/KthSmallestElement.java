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

   public int kthSmallestUsingMorrisTraversal(BinaryTreeNode root, int k) {
      int kthSmallestElement = -1;
      int count = 0;
      BinaryTreeNode current = root;
      while (current != null) {
         if (current.left == null) {
            count++;
            if (count == k) {
               kthSmallestElement = current.data;
               // shouldn't use break here, as this might skip the traversal and threads created will still be there.
            }
            current = current.right;
         } else {
            BinaryTreeNode prev = current.left;
            while (prev.right != null && prev.right != current) {
               prev = prev.right;
            }
            if (prev.right == null) {
               prev.right = current;
               current = current.left;
            } else {
               count++;
               prev.right = null;
               if (count == k) {
                  kthSmallestElement = current.data;
               }
               current = current.right;
            }
         }
      }
      return kthSmallestElement;
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
