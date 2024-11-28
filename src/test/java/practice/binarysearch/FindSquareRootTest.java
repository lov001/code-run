package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindSquareRootTest {

   FindSquareRoot classObj = new FindSquareRoot();

   @Test
   public void test_sqrtN_expect2_whenNIs6() {
      Assertions.assertEquals(2, classObj.sqrtN(6));
   }

   @Test
   public void test_sqrtN_expect10_whenNIs100() {
      Assertions.assertEquals(10, classObj.sqrtN(100));
   }

   @Test
   public void test_sqrtN_expect2_whenNIs7() {
      Assertions.assertEquals(2, classObj.sqrtN(7));
   }
}
