package practice.binarysearch;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthElementOfTwoSortedArraysTest {

   KthElementOfTwoSortedArrays classObj = new KthElementOfTwoSortedArrays();

   @Test
   void test_kthElement_expect6_whenNIs3AndMIs4() {
      ArrayList<Integer> arr1 = new ArrayList<>();
      arr1.add(2);
      arr1.add(3);
      arr1.add(45);
      ArrayList<Integer> arr2 = new ArrayList<>();
      arr2.add(4);
      arr2.add(6);
      arr2.add(7);
      arr2.add(8);
      Assertions.assertEquals(6, classObj.kthElement(arr1, arr2, 3, 4, 4));
   }

   @Test
   void test_kthElement_expect4_whenNIs5AndMIs2() {
      ArrayList<Integer> arr1 = new ArrayList<>();
      arr1.add(2);
      arr1.add(3);
      arr1.add(6);
      arr1.add(7);
      arr1.add(9);
      ArrayList<Integer> arr2 = new ArrayList<>();
      arr2.add(1);
      arr2.add(4);
      arr2.add(8);
      arr2.add(10);
      Assertions.assertEquals(4, classObj.kthElement(arr1, arr2, 5, 4, 4));
   }

   @Test
   void test_kthElement_expect6_whenNIs5AndMIs5() {
      ArrayList<Integer> arr1 = new ArrayList<>();
      arr1.add(1);
      arr1.add(2);
      arr1.add(3);
      arr1.add(5);
      arr1.add(6);
      ArrayList<Integer> arr2 = new ArrayList<>();
      arr2.add(4);
      arr2.add(7);
      arr2.add(8);
      arr2.add(9);
      arr2.add(100);
      Assertions.assertEquals(6, classObj.kthElement(arr1, arr2, 5, 5, 6));
   }
}
