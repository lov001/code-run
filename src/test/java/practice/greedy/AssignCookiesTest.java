package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssignCookiesTest {

   AssignCookies classObj = new AssignCookies();

   @Test
   void test_assignCookie_expect2_whenNIs4AndMIs3() {
      int[] greed = {3, 5, 6, 4};
      int[] size = {1, 4, 5};
      Assertions.assertEquals(2, classObj.assignCookie(greed, size));
   }

   @Test
   void test_assignCookie_expect3_whenNIs3AndMIs4() {
      int[] greed = {1, 2, 3};
      int[] size = {1, 2, 3, 4};
      Assertions.assertEquals(3, classObj.assignCookie(greed, size));
   }

   @Test
   void test_assignCookie_expect3_whenNIs5AndMIs5() {
      int[] greed = {4, 5, 6, 7, 8};
      int[] size = {2, 3, 4, 5, 6};
      Assertions.assertEquals(3, classObj.assignCookie(greed, size));
   }
}
