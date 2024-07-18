package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordLadderTest {

   WordLadder classObj = new WordLadder();

   @Test
   void test_wordLadderLength_expect3_whenStartWordIsDerAndEndWordIsDfs() {
      String[] wordList = {"des", "der", "dfr", "dgt", "dfs"};
      Assertions.assertEquals(3, classObj.wordLadderLength("der", "dfs", wordList));
   }

   @Test
   void test_wordLadderLength_expect2_whenStartWordIsGedkAndEndWordIsGeek() {
      String[] wordList = {"geek", "gefk"};
      Assertions.assertEquals(2, classObj.wordLadderLength("gedk", "geek", wordList));
   }

   @Test
   void test_wordLadderLength_expect7_whenStartWordIsToonAndEndWordIsPlea() {
      String[] wordList = {"poon", "plee", "same", "poie", "plea", "plie", "poin"};
      Assertions.assertEquals(7, classObj.wordLadderLength("toon", "plea", wordList));
   }
}
