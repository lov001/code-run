package practice.graphs;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordLadder2Test {

   WordLadder2 classObj = new WordLadder2();

   @Test
   void test_findSequences_expectResultOfSize2_whenStartWordIsDerAndEndWordIsDfs() {
      String[] wordList = {"des", "der", "dfr", "dgt", "dfs"};
      ArrayList<ArrayList<String>> output = new ArrayList<>();
      ArrayList<String> s2 = new ArrayList<>();
      s2.add("der");
      s2.add("dfr");
      s2.add("dfs");
      output.add(s2);
      ArrayList<String> s1 = new ArrayList<>();
      s1.add("der");
      s1.add("des");
      s1.add("dfs");
      output.add(s1);

      Assertions.assertArrayEquals(new ArrayList[]{output},
         new ArrayList[]{classObj.findSequences("der", "dfs", wordList)});
   }

   @Test
   void test_findSequences_expectResultOfSize1_whenStartWordIsGedkAndEndWordIsGeek() {
      String[] wordList = {"geek", "gefk"};
      ArrayList<ArrayList<String>> output = new ArrayList<>();
      ArrayList<String> s1 = new ArrayList<>();
      s1.add("gedk");
      s1.add("geek");
      output.add(s1);
      Assertions.assertArrayEquals(new ArrayList[]{output},
         new ArrayList[]{classObj.findSequences("gedk", "geek", wordList)});
   }
}
