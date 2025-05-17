package practice.slidingwindow;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubStringWithConcatenationOfAllWordsTest {

   SubStringWithConcatenationOfAllWords classObj = new SubStringWithConcatenationOfAllWords();

   @Test
   void test_findSubstring_expectOutputOfSize2_whenWordsSizeIs2AndWordSize3() {
      String inputString = "barfoothefoobarman";
      String[] words = {"foo", "bar"};
      List<Integer> expected = new ArrayList<>();
      expected.add(0);
      expected.add(9);
      List<Integer> actual = classObj.findSubstring(inputString, words);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_findSubstring_expectOutputOfSize0_whenWordsSizeIs4AndWordSize4() {
      String inputString = "wordgoodgoodgoodbestword";
      String[] words = {"word", "good", "best", "word"};
      List<Integer> expected = new ArrayList<>();
      List<Integer> actual = classObj.findSubstring(inputString, words);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_findSubstring_expectOutputOfSize3_whenWordsSizeIs3AndWordSize3() {
      String inputString = "barfoofoobarthefoobarman";
      String[] words = {"bar", "foo", "the"};
      List<Integer> expected = new ArrayList<>();
      expected.add(6);
      expected.add(9);
      expected.add(12);
      List<Integer> actual = classObj.findSubstring(inputString, words);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_findSubstring_expectOutputOfSize1_whenWordsSizeIs4AndWordSize4() {
      String inputString = "wordgoodgoodgoodbestword";
      String[] words = {"word", "good", "best", "good"};
      List<Integer> expected = new ArrayList<>();
      expected.add(8);
      List<Integer> actual = classObj.findSubstring(inputString, words);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }
}
