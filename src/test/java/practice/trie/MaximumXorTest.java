package practice.trie;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumXorTest {

   MaximumXor classObj = new MaximumXor();

   @Test
   void test_maxXOR_expect15_whenInputIsNIs7AndMIs7() {
      ArrayList<Integer> arr1 = new ArrayList<>();
      arr1.add(6);
      arr1.add(6);
      arr1.add(0);
      arr1.add(6);
      arr1.add(8);
      arr1.add(5);
      arr1.add(6);
      ArrayList<Integer> arr2 = new ArrayList<>();
      arr2.add(1);
      arr2.add(7);
      arr2.add(1);
      arr2.add(7);
      arr2.add(8);
      arr2.add(0);
      arr2.add(2);
      Assertions.assertEquals(15, classObj.maxXOR(7, 7, arr1, arr2));
   }

   @Test
   void test_maxXOR_expect28_whenNIs3AndMIs3() {
      ArrayList<Integer> arr1 = new ArrayList<>();
      arr1.add(25);
      arr1.add(10);
      arr1.add(2);
      ArrayList<Integer> arr2 = new ArrayList<>();
      arr2.add(8);
      arr2.add(5);
      arr2.add(3);
      Assertions.assertEquals(28, classObj.maxXOR(3, 3, arr1, arr2));
   }
}
