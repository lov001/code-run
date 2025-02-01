package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberIITest {

   SingleNumberII classObj = new SingleNumberII();

   @Test
   void test_occursOnce_expect2_whenNIs4() {
      int[] input = {1, 2, 1, 1};
      Assertions.assertEquals(2, classObj.elementThatAppearsOnce(input));
   }

   @Test
   void test_occursOnce_expect4_whenNIs7() {
      int[] input = {1, 3, 3, 3, 1, 1, 4};
      Assertions.assertEquals(4, classObj.elementThatAppearsOnce(input));
   }
}
