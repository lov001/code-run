package practice.trie;

import java.util.ArrayList;

public class MaximumXor {

   public static int maxXOR(int n, int m, ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
      Trie trie = new Trie();
      for (int i = 0; i < n; i++) {
         trie.insert(arr1.get(i));
      }
      int maxXor = 0;
      for (int i = 0; i < m; i++) {
         maxXor = Math.max(maxXor, trie.getMax(arr2.get(i)));
      }
      return maxXor;
   }

   public static class Trie {

      static Node root;

      public Trie() {
         root = new Node();
      }

      public void insert(int element) {
         Node node = root;
         for (int i = 31; i >= 0; i--) {
            int bit = (element >> i) & 1;
            if (!node.containsKey(bit)) {
               node.put(bit, new Node());
            }
            node = node.get(bit);
         }
      }

      public int getMax(int element) {
         int xorMax = 0;
         Node node = root;
         for (int i = 31; i >= 0; i--) {
            int bit = (element >> i) & 1;
            if (node.containsKey(1 - bit)) {
               xorMax = xorMax | (1 << i);
               node = node.get(1 - bit);
            } else {
               node = node.get(bit);
            }
         }
         return xorMax;
      }
   }

   public static class Node {

      Node[] links = new Node[2];

      public boolean containsKey(int index) {
         return links[index] != null;
      }

      public Node get(int index) {
         return links[index];
      }

      public void put(int index, Node node) {
         links[index] = node;
      }
   }
}
