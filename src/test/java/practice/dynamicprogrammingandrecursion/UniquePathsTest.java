package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniquePathsTest {

   UniquePaths classObj = new UniquePaths();

   @Test
   void test_uniquePaths_expect28_whenRowIs3AndColumnIs7() {
      Assertions.assertEquals(28, classObj.uniquePaths(3, 7));
   }

   @Test
   void test_uniquePaths_expect3_whenRowIs3AndColumnIs2() {
      Assertions.assertEquals(3, classObj.uniquePaths(3, 2));
   }
}
