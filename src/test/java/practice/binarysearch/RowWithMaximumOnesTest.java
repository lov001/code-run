package practice.binarysearch;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RowWithMaximumOnesTest {

   RowWithMaximumOnes classObj = new RowWithMaximumOnes();

   @Test
   public void test_rowMaxOnes_expect0_whenNIs3MIs3() {
      ArrayList<Integer> row1 = new ArrayList<>();
      row1.add(1);
      row1.add(1);
      row1.add(1);
      ArrayList<Integer> row2 = new ArrayList<>();
      row2.add(0);
      row2.add(0);
      row2.add(1);
      ArrayList<Integer> row3 = new ArrayList<>();
      row3.add(0);
      row3.add(0);
      row3.add(0);
      ArrayList<ArrayList<Integer>> input = new ArrayList<>();
      input.add(row1);
      input.add(row2);
      input.add(row3);
      Assertions.assertEquals(0, classObj.rowMaxOnes(input, 3, 3));
      Assertions.assertEquals(0, classObj.rowMaxOnesOptimised(input, 3, 3));
      Assertions.assertEquals(0, classObj.rowMaxOnesBinarySearch(input, 3, 3));
   }

   @Test
   public void test_rowMaxOnes_expect0_whenNIs2MIs2() {
      ArrayList<Integer> row1 = new ArrayList<>();
      row1.add(1);
      row1.add(1);
      ArrayList<Integer> row2 = new ArrayList<>();
      row2.add(1);
      row2.add(1);
      ArrayList<ArrayList<Integer>> input = new ArrayList<>();
      input.add(row1);
      input.add(row2);
      Assertions.assertEquals(0, classObj.rowMaxOnes(input, 2, 2));
      Assertions.assertEquals(0, classObj.rowMaxOnesOptimised(input, 2, 2));
      Assertions.assertEquals(0, classObj.rowMaxOnesBinarySearch(input, 2, 2));
   }

   @Test
   public void test_rowMaxOnes_expectMinusOne_whenNIs2MIs2() {
      ArrayList<Integer> row1 = new ArrayList<>();
      row1.add(0);
      row1.add(0);
      ArrayList<Integer> row2 = new ArrayList<>();
      row2.add(0);
      row2.add(0);
      ArrayList<ArrayList<Integer>> input = new ArrayList<>();
      input.add(row1);
      input.add(row2);
      Assertions.assertEquals(-1, classObj.rowMaxOnes(input, 2, 2));
      Assertions.assertEquals(-1, classObj.rowMaxOnesOptimised(input, 2, 2));
      Assertions.assertEquals(-1, classObj.rowMaxOnesBinarySearch(input, 2, 2));
   }
}
