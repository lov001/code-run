package practice.greedy;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertIntervalTest {

   InsertInterval classObj = new InsertInterval();

   @Test
   void test_insertInterval_expectOutputOfSize4_whenNIs3() {
      ArrayList<ArrayList<Integer>> input = new ArrayList<>();
      ArrayList<Integer> interval1 = new ArrayList<>();
      interval1.add(1);
      interval1.add(3);
      input.add(interval1);
      ArrayList<Integer> interval2 = new ArrayList<>();
      interval2.add(5);
      interval2.add(7);
      input.add(interval2);
      ArrayList<Integer> interval3 = new ArrayList<>();
      interval3.add(8);
      interval3.add(12);
      input.add(interval3);

      ArrayList<Integer> newInterval = new ArrayList<>();
      newInterval.add(4);
      newInterval.add(6);
      ArrayList<ArrayList<Integer>> actual = classObj.insertInterval(input, newInterval);
      Assertions.assertEquals(3, actual.size());
      Assertions.assertEquals(1, actual.get(0).get(0));
      Assertions.assertEquals(3, actual.get(0).get(1));
      Assertions.assertEquals(4, actual.get(1).get(0));
      Assertions.assertEquals(7, actual.get(1).get(1));
      Assertions.assertEquals(8, actual.get(2).get(0));
      Assertions.assertEquals(12, actual.get(2).get(1));
   }
}
