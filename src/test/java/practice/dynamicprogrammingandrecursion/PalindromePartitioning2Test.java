package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromePartitioning2Test {

   PalindromePartitioning2 classObj = new PalindromePartitioning2();

   @Test
   void test_partition_expect2_whenInputIsaaccb() {
      Assertions.assertEquals(2, classObj.palindromePartitioning("aaccb"));
      Assertions.assertEquals(2, classObj.palindromePartitioningTabulation("aaccb"));
   }

   @Test
   void test_partition_expect0_whenInputIsababa() {
      Assertions.assertEquals(0, classObj.palindromePartitioning("ababa"));
      Assertions.assertEquals(0, classObj.palindromePartitioningTabulation("ababa"));
   }

   @Test
   void test_partition_expect1_whenInputIsaababa() {
      Assertions.assertEquals(1, classObj.palindromePartitioning("aababa"));
      Assertions.assertEquals(1, classObj.palindromePartitioningTabulation("aababa"));
   }
}
