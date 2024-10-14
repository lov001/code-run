package practice.binarysearch;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstAndLastOccurrenceTest {

   FirstAndLastOccurrencesOfElement classObj = new FirstAndLastOccurrencesOfElement();

   @Test
   public void test_firstAndLastPosition_expect1And2_whenTargetIs1() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(0);
      input.add(1);
      input.add(1);
      input.add(5);
      int[] expected = {1, 2};
      int[] actual = classObj.firstAndLastPosition(input, 4, 1);
      Assertions.assertArrayEquals(expected, actual);

      actual = classObj.firstAndLastPositionUsingBinarySearch(input, 4, 1);
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   public void test_firstAndLastPosition_expect4And7_whenTargetIs2() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(0);
      input.add(0);
      input.add(1);
      input.add(1);
      input.add(2);
      input.add(2);
      input.add(2);
      input.add(2);
      int[] expected = {4, 7};
      int[] actual = classObj.firstAndLastPosition(input, 8, 2);
      Assertions.assertArrayEquals(expected, actual);

      actual = classObj.firstAndLastPositionUsingBinarySearch(input, 8, 2);
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   public void test_firstAndLastPosition_expect1And1_whenTargetIs2() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(3);
      input.add(3);
      input.add(5);
      int[] expected = {-1, -1};
      int[] actual = classObj.firstAndLastPosition(input, 4, 2);
      Assertions.assertArrayEquals(expected, actual);

      actual = classObj.firstAndLastPositionUsingBinarySearch(input, 4, 2);
      Assertions.assertArrayEquals(expected, actual);
   }
}
