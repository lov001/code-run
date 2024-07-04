package practice.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedSearchWithoutSizeTest {

   SortedSearchWithoutSize classObj = new SortedSearchWithoutSize();

   @Test
   void test_search_expectMinusOne_whenElementNotFound() {
      int[] array = {1, 4, 7, 9, 11, 15};
      Listy list = new Listy(array);
      Assertions.assertEquals(-1, classObj.search(list, 5));
   }

   @Test
   void test_search_expect0_whenFirstElement() {
      int[] array = {1, 4, 7, 9, 11, 15};
      Listy list = new Listy(array);
      Assertions.assertEquals(0, classObj.search(list, 1));
   }

   @Test
   void test_search_expect3_whenFourthElement() {
      int[] array = {1, 4, 7, 9, 11, 15};
      Listy list = new Listy(array);
      Assertions.assertEquals(3, classObj.search(list, 9));
   }

   @Test
   void test_search_expect3_whenLastElement() {
      int[] array = {1, 4, 7, 9, 11, 15, 19, 27, 35};
      Listy list = new Listy(array);
      Assertions.assertEquals(8, classObj.search(list, 35));
   }
}
