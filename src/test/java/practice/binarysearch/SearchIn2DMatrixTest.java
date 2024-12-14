package practice.binarysearch;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchIn2DMatrixTest {

   SearchIn2DMatrix classObj = new SearchIn2DMatrix();

   @Test
   public void test_searchMatrix_expectTrue_whenNIs3MIs3() {
      ArrayList<Integer> row1 = new ArrayList<>();
      row1.add(1);
      row1.add(2);
      row1.add(3);
      row1.add(4);
      ArrayList<Integer> row2 = new ArrayList<>();
      row2.add(5);
      row2.add(6);
      row2.add(7);
      row2.add(8);
      ArrayList<Integer> row3 = new ArrayList<>();
      row3.add(9);
      row3.add(10);
      row3.add(11);
      row3.add(12);
      ArrayList<ArrayList<Integer>> input = new ArrayList<>();
      input.add(row1);
      input.add(row2);
      input.add(row3);
      Assertions.assertTrue(classObj.searchMatrixBinarySearch(input, 8));
      Assertions.assertTrue(classObj.searchMatrixBruteForce(input, 8));
      Assertions.assertTrue(classObj.searchMatrixBinarySearchOptimised(input, 8));
      Assertions.assertTrue(classObj.searchMatrixBinarySearchOptimisedWith1DArray(input, 8));
   }

   @Test
   public void test_searchMatrix_expectFalse_whenNIs3MIs3() {
      ArrayList<Integer> row1 = new ArrayList<>();
      row1.add(1);
      row1.add(2);
      row1.add(4);
      ArrayList<Integer> row2 = new ArrayList<>();
      row2.add(6);
      row2.add(7);
      row2.add(8);
      ArrayList<Integer> row3 = new ArrayList<>();
      row3.add(9);
      row3.add(10);
      row3.add(34);
      ArrayList<ArrayList<Integer>> input = new ArrayList<>();
      input.add(row1);
      input.add(row2);
      input.add(row3);
      Assertions.assertFalse(classObj.searchMatrixBinarySearch(input, 78));
      Assertions.assertFalse(classObj.searchMatrixBruteForce(input, 78));
      Assertions.assertFalse(classObj.searchMatrixBinarySearchOptimised(input, 78));
      Assertions.assertFalse(classObj.searchMatrixBinarySearchOptimisedWith1DArray(input, 78));
   }
}
