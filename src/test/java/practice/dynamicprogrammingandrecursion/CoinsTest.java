package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoinsTest {

   Coins classObj = new Coins();

   @Test
   void test_makeChange_expect242_whenNIs100() {
      Assertions.assertEquals(242, classObj.makeChange(100));
      Assertions.assertEquals(242, classObj.makeChangeOptimised(100));
   }

   @Test
   void test_makeChange_expect1_whenNIs1() {
      Assertions.assertEquals(1, classObj.makeChange(1));
      Assertions.assertEquals(1, classObj.makeChangeOptimised(1));
   }

   @Test
   void test_makeChange_expect_whenNIs33() {
      Assertions.assertEquals(18, classObj.makeChange(33));
      Assertions.assertEquals(18, classObj.makeChangeOptimised(33));
   }
}
