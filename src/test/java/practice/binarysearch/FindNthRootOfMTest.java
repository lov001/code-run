package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindNthRootOfMTest {

   FindNthRootOfM classObj = new FindNthRootOfM();

   @Test
   public void test_NthRootBruteForce_expect3_whenNIs3() {
      Assertions.assertEquals(3, classObj.NthRootBruteForce(3, 27));
      Assertions.assertEquals(3, classObj.NthRoot(3, 27));
   }

   @Test
   public void test_NthRootBruteForce_expectMinus1_whenNIs4() {
      Assertions.assertEquals(-1, classObj.NthRootBruteForce(4, 69));
      Assertions.assertEquals(-1, classObj.NthRoot(4, 69));
   }

   @Test
   public void test_NthRootBruteForce_expect5_whenNIs9() {
      Assertions.assertEquals(5, classObj.NthRootBruteForce(9, 1953125));
      Assertions.assertEquals(5, classObj.NthRoot(9, 1953125));
   }

}
