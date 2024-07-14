package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseScheduleTest {

   CourseSchedule classObj = new CourseSchedule();

   @Test
   void test_findOrder_expectTrue_whenTasksCanBePerformed() {
      List<List<Integer>> input = new ArrayList<>();
      input.add(List.of(1, 0));
      int[] output = {0, 1};
      Assertions.assertArrayEquals(output, classObj.findOrder(2, 1, input));
   }

   @Test
   void test_findOrder_expectFalse_whenTasksCannotBePerformed() {
      List<List<Integer>> input = new ArrayList<>();
      input.add(List.of(1, 0));
      input.add(List.of(2, 0));
      input.add(List.of(3, 1));
      input.add(List.of(3, 2));
      int[] output = {0, 1, 2, 3};
      Assertions.assertArrayEquals(output, classObj.findOrder(4, 4, input));
   }
}
