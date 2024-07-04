package practice.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupAnagramTest {

   GroupAnagrams classObj = new GroupAnagrams();

   @Test
   void test_groupAnagrams_expectSortedAnagrams_whenGivenInput() {
      String[] input = {"acre", "bark", "karb", "care", "file", "race", "life"};
      String[] output = {"bark", "karb", "acre", "care", "race", "file", "life"};
      classObj.groupAnagrams(input);
      Assertions.assertArrayEquals(output, input);
   }

   @Test
   void test_groupAnagramsOptimised_expectSortedAnagrams_whenGivenInput() {
      String[] input = {"acre", "bark", "karb", "care", "file", "race", "life"};
      String[] output = {"acre", "care", "race", "bark", "karb", "file", "life"};
      classObj.groupAnagramOptimised(input);
      Assertions.assertArrayEquals(output, input);
   }
}
