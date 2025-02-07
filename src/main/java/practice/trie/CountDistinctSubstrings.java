package practice.trie;

public class CountDistinctSubstrings {

   public int countDistinctSubstrings(String s) {
      int count = 0;
      Node root = new Node();
      for (int i = 0; i < s.length(); i++) {
         Node node = root;
         for (int j = i; j < s.length(); j++) {
            if (!node.containsCharacter(s.charAt(j))) {
               count++;
               node.set(s.charAt(j), new Node());
            }
            node = node.get(s.charAt(j));
         }
      }
      return count + 1;
   }
}
