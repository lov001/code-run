package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonOverlappingIntervalsTest {

   NonOverlappingIntervals classObj = new NonOverlappingIntervals();

   @Test
   void test_minimumReschedules_expect1_whenNIs4() {
      int[][] input = {
         {1, 2},
         {2, 3},
         {1, 3},
         {3, 4},
      };
      Assertions.assertEquals(1, classObj.minimumReschedules(4, input));
   }

   @Test
   void test_minimumReschedules_expect0_whenNIs3() {
      int[][] input = {
         {3, 4},
         {4, 5},
         {5, 6},
      };
      Assertions.assertEquals(0, classObj.minimumReschedules(3, input));
   }

   @Test
   void test_maxMeeting_expect2_whenNIs5() {
      int[][] input = {
         {2, 3},
         {4, 5},
         {6, 7},
         {2, 4},
         {3, 6},
      };
      Assertions.assertEquals(2, classObj.minimumReschedules(5, input));
   }

   @Test
   void test_maxMeeting_expect3_whenNIs4() {
      int[][] input = {
         {4, 6},
         {4, 7},
         {3, 5},
         {3, 5},
      };
      Assertions.assertEquals(3, classObj.minimumReschedules(4, input));
   }
}
