package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NQueenTest {

   NQueen classObj = new NQueen();

   @Test
   void test_solveNQueens_expect2DistinctSolutions_whenNIs4() {
      List<List<String>> expected = new ArrayList<>();
      int n = 4;
      for (int i = 0; i < 2; i++) {
         expected.add(new ArrayList<>());
      }
      expected.get(1).addAll(List.of(".Q..", "...Q", "Q...", "..Q."));
      expected.get(0).addAll(List.of("..Q.", "Q...", "...Q", ".Q.."));
      List<List<String>> actual = classObj.solveNQueens(n);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < actual.size(); i++) {
         List<String> response = actual.get(i);
         for (int j = 0; j < response.size(); j++) {
            String actualRow = actual.get(i).get(j);
            String expectedRow = expected.get(i).get(j);
            Assertions.assertEquals(expectedRow, actualRow);
         }
      }
   }

   @Test
   void test_solveNQueensOptimised_expect2DistinctSolutions_whenNIs4() {
      List<List<String>> expected = new ArrayList<>();
      int n = 4;
      for (int i = 0; i < 2; i++) {
         expected.add(new ArrayList<>());
      }
      expected.get(1).addAll(List.of(".Q..", "...Q", "Q...", "..Q."));
      expected.get(0).addAll(List.of("..Q.", "Q...", "...Q", ".Q.."));
      List<List<String>> actual = classObj.solveNQueensOptimised(n);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < actual.size(); i++) {
         List<String> response = actual.get(i);
         for (int j = 0; j < response.size(); j++) {
            String actualRow = actual.get(i).get(j);
            String expectedRow = expected.get(i).get(j);
            Assertions.assertEquals(expectedRow, actualRow);
         }
      }
   }
}
