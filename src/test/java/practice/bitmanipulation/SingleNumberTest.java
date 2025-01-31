package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberTest {

   SingleNumber classObj = new SingleNumber();

   @Test
   void test_occursOnce_expect7_whenAIs13AndBIs7() {
      int[] input = {7, 3, 5, 4, 5, 3, 4};
      Assertions.assertEquals(7, classObj.occursOnce(input));
   }

   @Test
   void test_occursOnce_expect1_whenAIs15AndBIs20() {
      int[] input = {1, 6, 4, 6, 2, 4, 2};
      Assertions.assertEquals(1, classObj.occursOnce(input));
   }
}
