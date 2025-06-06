package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BitOperationsTest {

   BitOperations classObj = new BitOperations();

   @Test
   void test_swap_expectXIs7AndYIs3_whenXIs3AndYIs7() {
      int x = 3;
      int y = 7;
      classObj.swap(x, y);
      Assertions.assertEquals(3, x);
      Assertions.assertEquals(7, y);
   }

   @Test
   void test_swap_expectXIs99AndYIs5_whenXIs5AndYIs99() {
      int x = 5;
      int y = 99;
      classObj.swap(x, y);
      Assertions.assertEquals(5, x);
      Assertions.assertEquals(99, y);
   }

   @Test
   void test_checkIthBit_expectTrue_whenNIs7AndIs2() {
      Assertions.assertTrue(classObj.checkIthBit(7, 2));
   }

   @Test
   void test_checkIthBit_expectTrue_whenNIs8AndIs3() {
      Assertions.assertTrue(classObj.checkIthBit(8, 3));
   }

   @Test
   void test_checkIthBit_expectTrue_whenNIs3AndIs1() {
      Assertions.assertTrue(classObj.checkIthBit(3, 1));
   }

   @Test
   void test_checkIthBit_expectFalse_whenNIs8AndIs0() {
      Assertions.assertFalse(classObj.checkIthBit(8, 0));
   }

   @Test
   void test_setIthBit_expect13_whenNIs9AndIs2() {
      Assertions.assertEquals(13, classObj.setIthBit(9, 2));
   }

   @Test
   void test_clearIthBit_expect9_whenNIs9AndIs2() {
      Assertions.assertEquals(9, classObj.clearIthBit(9, 2));
   }

   @Test
   void test_toggleIthBit_expect15_whenNIs13AndIs1() {
      Assertions.assertEquals(15, classObj.toggleIthBit(13, 1));
   }

   @Test
   void test_removeLastSetBit_expect0_whenNIs16() {
      Assertions.assertEquals(0, classObj.removeLastSetBit(16));
   }

   @Test
   void test_removeLastSetBit_expect32_whenNIs40() {
      Assertions.assertEquals(32, classObj.removeLastSetBit(40));
   }

   @Test
   void test_removeLastSetBit_expect80_whenNIs84() {
      Assertions.assertEquals(80, classObj.removeLastSetBit(84));
   }

   @Test
   void test_checkPowerOf2_expectTrue_whenNIs16() {
      Assertions.assertTrue(classObj.checkPowerOf2(16));
   }

   @Test
   void test_checkPowerOf2_expectFalse_whenNIs13() {
      Assertions.assertFalse(classObj.checkPowerOf2(13));
   }

   @Test
   void test_checkPowerOf2_expectTrue_whenNIs32() {
      Assertions.assertTrue(classObj.checkPowerOf2(32));
   }

   @Test
   void test_countNumberOfSetBits_expect1_whenNIs16() {
      Assertions.assertEquals(1, classObj.countNumberOfSetBits(16));
   }

   @Test
   void test_countNumberOfSetBits_expect3_whenNIs13() {
      Assertions.assertEquals(3, classObj.countNumberOfSetBits(13));
   }
}
