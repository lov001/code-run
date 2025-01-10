package practice.arrays;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZeroMatrixTest {

   ZeroMatrix classObj = new ZeroMatrix();

   @Test
   void test_zeroMatrix_expectTrue_whenNIs2AndMIs3() {
      ArrayList<ArrayList<Integer>> input = new ArrayList<>();
      ArrayList<Integer> row1 = new ArrayList<>();
      row1.add(2);
      row1.add(4);
      row1.add(3);
      ArrayList<Integer> row2 = new ArrayList<>();
      row2.add(1);
      row2.add(0);
      row2.add(0);
      input.add(row1);
      input.add(row2);
      ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
      ArrayList<Integer> rowO1 = new ArrayList<>();
      rowO1.add(2);
      rowO1.add(0);
      rowO1.add(0);
      ArrayList<Integer> rowO2 = new ArrayList<>();
      rowO2.add(0);
      rowO2.add(0);
      rowO2.add(0);
      expected.add(rowO1);
      expected.add(rowO2);
      ArrayList<ArrayList<Integer>> actual = classObj.zeroMatrixBruteForce(input, 2, 3);
      Assertions.assertArrayEquals(new ArrayList[]{expected}, new ArrayList[]{actual});
   }

   @Test
   void test_zeroMatrixBetter_expectTrue_whenNIs2AndMIs3() {
      ArrayList<ArrayList<Integer>> input = new ArrayList<>();
      ArrayList<Integer> row1 = new ArrayList<>();
      row1.add(2);
      row1.add(4);
      row1.add(3);
      ArrayList<Integer> row2 = new ArrayList<>();
      row2.add(1);
      row2.add(0);
      row2.add(0);
      input.add(row1);
      input.add(row2);
      ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
      ArrayList<Integer> rowO1 = new ArrayList<>();
      rowO1.add(2);
      rowO1.add(0);
      rowO1.add(0);
      ArrayList<Integer> rowO2 = new ArrayList<>();
      rowO2.add(0);
      rowO2.add(0);
      rowO2.add(0);
      expected.add(rowO1);
      expected.add(rowO2);
      ArrayList<ArrayList<Integer>> actual = classObj.zeroMatrixBetter(input, 2, 3);
      Assertions.assertArrayEquals(new ArrayList[]{expected}, new ArrayList[]{actual});
   }
}
