package practice.trie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrieTest {

   @Test
   void test_trie_expectOutput_whenPerformed5GivenOperations() {
      Trie trie = new Trie();
      trie.insert("hello");
      trie.insert("help");
      Assertions.assertTrue(trie.search("help"));
      Assertions.assertTrue(trie.startsWith("hel"));
      Assertions.assertFalse(trie.search("hel"));
   }

   @Test
   void test_trie_expectOutput_whenPerformed10GivenOperations() {
      Trie trie = new Trie();
      trie.insert("aaaa");
      trie.insert("aaaaaa");
      trie.insert("bcd");
      Assertions.assertFalse(trie.search("aaaaa"));
      Assertions.assertTrue(trie.startsWith("aaaaa"));
      Assertions.assertTrue(trie.startsWith("bc"));
      Assertions.assertFalse(trie.search("bc"));
      trie.insert("bc");
      Assertions.assertFalse(trie.startsWith("bcda"));
      Assertions.assertTrue(trie.search("bc"));
   }
}
