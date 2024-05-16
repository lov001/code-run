package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConversionTest {

   Conversion classObj = new Conversion();

   @Test
   void test_bitFlipsRequiredForConversion_expect2_whenSourceIs29AndTargetIs15() {
      int source = 29;
      int target = 15;
      Assertions.assertEquals(2, classObj.bitFlipsRequiredForConversion(source, target));
   }

   @Test
   void test_bitFlipsRequiredForConversion_expect3_whenSourceIs10AndTargetIs7() {
      int source = 10;
      int target = 7;
      Assertions.assertEquals(3, classObj.bitFlipsRequiredForConversion(source, target));
   }

   @Test
   void test_bitFlipsRequiredForConversion_expect3_whenSourceIs3AndTargetIs4() {
      int source = 3;
      int target = 4;
      Assertions.assertEquals(3, classObj.bitFlipsRequiredForConversion(source, target));
   }
}
