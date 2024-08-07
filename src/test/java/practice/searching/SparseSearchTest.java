package practice.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SparseSearchTest {

   SparseSearch classObj = new SparseSearch();

   @Test
   void test_search_expectMinusOne_whenElementNotFound() {
      String[] array = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
      Assertions.assertEquals(-1, classObj.search(array, "hello"));
      Assertions.assertEquals(-1, classObj.searchOptimised(array, "hello"));
   }

   @Test
   void test_search_expect0_whenFirstElement() {
      String[] array = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
      Assertions.assertEquals(0, classObj.search(array, "at"));
      Assertions.assertEquals(0, classObj.searchOptimised(array, "at"));
   }

   @Test
   void test_search_expect4_whenFourthElement() {
      String[] array = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
      Assertions.assertEquals(4, classObj.search(array, "ball"));
      Assertions.assertEquals(4, classObj.searchOptimised(array, "ball"));
   }

   @Test
   void test_search_expect3_whenLastElement() {
      String[] array = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
      Assertions.assertEquals(10, classObj.search(array, "dad"));
      Assertions.assertEquals(10, classObj.searchOptimised(array, "dad"));
   }
}
