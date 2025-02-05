package practice.trie;

public class CompleteString {

   public String completeString(String[] a) {
      Trie trie = new Trie();
      for (String word : a) {
         trie.insert(word);
      }
      String longestCompleteString = "";
      for (String word : a) {
         if (trie.checkIfPrefixExists(word)) {
            if (word.length() > longestCompleteString.length()) {
               longestCompleteString = word;
            } else if (word.length() == longestCompleteString.length()
               && word.compareTo(longestCompleteString) < 0) {
               longestCompleteString = word;
            }
         }
      }
      if ("".equals(longestCompleteString)) {
         return "None";
      }
      return longestCompleteString;
   }
}
