package practice.trie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrieIITest {

   @Test
   void test_trie_expectOutput_whenPerformed5GivenOperations() {
      TrieII trie = new TrieII();
      trie.insert("coding");
      trie.insert("ninja");
      Assertions.assertEquals(1, trie.countWordsEqualTo("coding"));
      Assertions.assertEquals(1, trie.countWordsStartingWith("nin"));
      trie.erase("coding");
   }

   @Test
   void test_trie_expectOutput_whenPerformed6GivenOperations() {
      TrieII trie = new TrieII();
      trie.insert("samsung");
      trie.insert("samsung");
      trie.insert("vivo");
      trie.erase("vivo");
      Assertions.assertEquals(2, trie.countWordsEqualTo("samsung"));
      Assertions.assertEquals(0, trie.countWordsStartingWith("vi"));
   }
}
