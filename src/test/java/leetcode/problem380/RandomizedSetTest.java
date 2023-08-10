package leetcode.problem380;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomizedSetTest {


   @Test
   void test_randomizedSet() {
      RandomizedSet randomizedSet = new RandomizedSet();
      Assertions.assertTrue(randomizedSet.insert(1));
      Assertions.assertFalse(randomizedSet.remove(2));
      Assertions.assertTrue(randomizedSet.insert(2));
      Assertions.assertTrue(randomizedSet.getAllValues().contains(randomizedSet.getRandom()));
      Assertions.assertTrue(randomizedSet.remove(1));
      Assertions.assertFalse(randomizedSet.insert(2));
      Assertions.assertTrue(randomizedSet.getAllValues().contains(randomizedSet.getRandom()));
   }

   @Test
   void test_randomizedSetUsingMapAndList() {
      RandomizedSetUsingMapAndArrayList randomizedSet = new RandomizedSetUsingMapAndArrayList();
      Assertions.assertTrue(randomizedSet.insert(1));
      Assertions.assertFalse(randomizedSet.remove(2));
      Assertions.assertTrue(randomizedSet.insert(2));
      Assertions.assertTrue(randomizedSet.getAllValues().contains(randomizedSet.getRandom()));
      Assertions.assertTrue(randomizedSet.remove(1));
      Assertions.assertFalse(randomizedSet.insert(2));
      Assertions.assertTrue(randomizedSet.getAllValues().contains(randomizedSet.getRandom()));
   }

}
