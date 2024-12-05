package practice.binarysearch;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllocateBooksTest {

   AllocateBooks classObj = new AllocateBooks();

   @Test
   public void test_findPages_expect71_whenNIs5MIs4() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(25);
      input.add(46);
      input.add(28);
      input.add(49);
      input.add(24);
      Assertions.assertEquals(71, classObj.findPages(input, 5, 4));
   }

   @Test
   public void test_findPages_expect113_whenNIs4MIs2() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(12);
      input.add(34);
      input.add(67);
      input.add(90);
      Assertions.assertEquals(113, classObj.findPages(input, 4, 2));
   }
}
