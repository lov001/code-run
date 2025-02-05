package practice.trie;

public class Node {

   Node[] links = new Node[26];
   boolean flag = false;

   int countEndsWith = 0;
   int countPrefix = 0;

   public boolean containsCharacter(Character ch) {
      return links[ch - 'a'] == null;
   }

   public Node get(Character ch) {
      return links[ch - 'a'];
   }

   public void set(Character ch, Node node) {
      links[ch - 'a'] = node;
   }

   public void setEnd() {
      flag = true;
   }

   public boolean isEnd() {
      return flag;
   }

   public void increaseCountPrefix() {
      this.countPrefix++;
   }

   public void increaseCountEnd() {
      this.countEndsWith++;
   }

   public void decreaseCountPrefix() {
      this.countPrefix--;
   }

   public void decreaseCountEnd() {
      this.countEndsWith--;
   }
}
