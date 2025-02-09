package practice.trie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MaximumXorWithAnElementFromArray {

   public ArrayList<Integer> maxXorQueries(ArrayList<Integer> arr,
      ArrayList<ArrayList<Integer>> queries) {
      Collections.sort(arr);
      ArrayList<ArrayList<Integer>> offlineQueries = new ArrayList<>();
      int m = queries.size();
      for (int i = 0; i < m; i++) {
         ArrayList<Integer> temp = new ArrayList<>();
         temp.add(queries.get(i).get(1));
         temp.add(queries.get(i).get(0));
         temp.add(i);
         offlineQueries.add(temp);
      }
      offlineQueries.sort(Comparator.comparing(a -> a.get(0)));
      int index = 0;
      int n = arr.size();
      Trie trie = new Trie();
      ArrayList<Integer> result = new ArrayList<>(m);
      for (int i = 0; i < m; i++) {
         result.add(-1);
      }
      for (int i = 0; i < m; i++) {
         while ((index < n && arr.get(index) <= offlineQueries.get(i).get(0))) {
            trie.insert(arr.get(index));
            index++;
         }
         int queryIndex = offlineQueries.get(i).get(2);
         if (index != 0) {
            result.set(queryIndex, trie.getMax(offlineQueries.get(i).get(1)));
         } else {
            result.set(queryIndex, -1);
         }
      }
      return result;
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
