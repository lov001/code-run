package practice.trie;

public class Trie {

   Node root;

   public Trie() {
      this.root = new Node();
   }

   public void insert(String word) {
      Node node = root;
      for (int i = 0; i < word.length(); i++) {
         Character character = word.charAt(i);
         if (node.containsCharacter(character)) {
            Node entry = new Node();
            node.set(character, entry);
         }
         node = node.get(character);
      }
      node.setEnd();
   }

   public boolean search(String word) {
      Node node = root;
      for (int i = 0; i < word.length(); i++) {
         Character character = word.charAt(i);
         if (node.containsCharacter(character)) {
            return false;
         }
         node = node.get(character);
      }
      return node.isEnd();
   }

   public boolean startsWith(String prefix) {
      Node node = root;
      for (int i = 0; i < prefix.length(); i++) {
         Character character = prefix.charAt(i);
         if (node.containsCharacter(character)) {
            return false;
         }
         node = node.get(character);
      }
      return true;
   }
}
