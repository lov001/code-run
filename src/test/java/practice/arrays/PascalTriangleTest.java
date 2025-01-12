package practice.arrays;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PascalTriangleTest {

   PascalTriangle classObj = new PascalTriangle();

   @Test
   void test_findElementInPascalTriangle_expect6_whenRIs5AndCIs3() {
      Assertions.assertEquals(6, classObj.findElementInPascalTriangle(5, 3));
   }

   @Test
   void test_findElementInPascalTriangle_expect5_whenRIs6AndCIs5() {
      Assertions.assertEquals(5, classObj.findElementInPascalTriangle(6, 5));
   }

   @Test
   void test_findRowInPascalTriangle_expect121_whenNIs3() {
      List<Integer> expected = new ArrayList<>();
      expected.add(1);
      expected.add(2);
      expected.add(1);
      List<Integer> actual = classObj.findRowInPascalTriangle(3);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_findRowInPascalTriangle_expect15101051_whenNIs6() {
      List<Integer> expected = new ArrayList<>();
      expected.add(1);
      expected.add(5);
      expected.add(10);
      expected.add(10);
      expected.add(5);
      expected.add(1);
      List<Integer> actual = classObj.findRowInPascalTriangle(6);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_pascalTriangle_expect_whenNIs5() {
      int[][] expected = {
         {1},
         {1, 1},
         {1, 2, 1},
         {1, 3, 3, 1},
         {1, 4, 6, 4, 1}
      };
      int[][] actual = classObj.pascalTriangle(5);
      Assertions.assertArrayEquals(expected, actual);
   }
}
