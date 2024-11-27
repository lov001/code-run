package practice.binarysearch;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPeakElementTest {

   FindPeakElement classObj = new FindPeakElement();

   @Test
   public void test_findPeakElement_expect8_whenTwoPeaks() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(8);
      input.add(1);
      input.add(5);
      input.add(3);
      Assertions.assertEquals(8, classObj.findPeakElement(input));
   }

   @Test
   public void test_findPeakElement_expect10_whenPeakIsAtBeginning() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(10);
      input.add(8);
      input.add(7);
      input.add(6);
      input.add(5);
      Assertions.assertEquals(10, classObj.findPeakElement(input));
   }

   @Test
   public void test_findPeakElement_expect5_whenPeakIsAtEnd() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(2);
      input.add(3);
      input.add(4);
      input.add(5);
      Assertions.assertEquals(5, classObj.findPeakElement(input));
   }
}
