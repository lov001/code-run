package practice.trie;

public class TrieII {

   Node root;

   public TrieII() {
      this.root = new Node();
   }

   public void insert(String word) {
      Node node = root;
      for (int i = 0; i < word.length(); i++) {
         Character character = word.charAt(i);
         if (!node.containsCharacter(character)) {
            Node entry = new Node();
            node.set(character, entry);
         }
         node = node.get(character);
         node.increaseCountPrefix();
      }
      node.increaseCountEnd();
   }

   public int countWordsEqualTo(String word) {
      Node node = root;
      for (int i = 0; i < word.length(); i++) {
         Character character = word.charAt(i);
         if (!node.containsCharacter(character)) {
            return 0;
         }
         node = node.get(character);
      }
      return node.countEndsWith;
   }

   public int countWordsStartingWith(String word) {
      Node node = root;
      for (int i = 0; i < word.length(); i++) {
         Character character = word.charAt(i);
         if (!node.containsCharacter(character)) {
            return 0;
         }
         node = node.get(character);
      }
      return node.countPrefix;
   }

   public void erase(String word) {
      Node node = root;
      for (int i = 0; i < word.length(); i++) {
         Character character = word.charAt(i);
         if (!node.containsCharacter(character)) {
            return;
         }
         node = node.get(character);
         node.decreaseCountPrefix();
      }
      node.decreaseCountEnd();
   }
}
