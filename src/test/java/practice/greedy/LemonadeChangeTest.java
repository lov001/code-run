package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LemonadeChangeTest {

   LemonadeChange classObj = new LemonadeChange();

   @Test
   void test_lemonadeChange_expectTrue_whenNIs6() {
      int[] input = {5, 5, 5, 10, 10, 20};
      Assertions.assertTrue(classObj.lemonadeChange(input));
   }

   @Test
   void test_lemonadeChange_expectTrue_whenNIs8() {
      int[] input = {5, 5, 5, 5, 10, 10, 20, 20};
      Assertions.assertTrue(classObj.lemonadeChange(input));
   }

   @Test
   void test_lemonadeChange_expectFalse_whenNIs7() {
      int[] input = {5, 10, 5, 10, 5, 20, 20};
      Assertions.assertFalse(classObj.lemonadeChange(input));
   }
}
