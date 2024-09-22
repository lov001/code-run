package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NinjaTrainingTest {

   NinjaTraining classObj = new NinjaTraining();

   @Test
   void test_ninjaTraining_expect11_whenNumberOfDaysIs3() {
      int[][] trainingDays = {
         {1, 2, 5},
         {3, 1, 1},
         {3, 3, 3}
      };
      Assertions.assertEquals(11, classObj.ninjaTraining(3, trainingDays));
   }

   @Test
   void test_ninjaTraining_expect210_whenNumberOfDaysIs3() {
      int[][] trainingDays = {
         {10, 40, 70},
         {20, 50, 80},
         {30, 60, 90}
      };
      Assertions.assertEquals(210, classObj.ninjaTraining(3, trainingDays));
   }

   @Test
   void test_ninjaTraining_expect45_whenNumberOfDaysIs3() {
      int[][] trainingDays = {
         {18, 11, 19},
         {4, 13, 7},
         {1, 8, 13}
      };
      Assertions.assertEquals(45, classObj.ninjaTraining(3, trainingDays));
   }

   @Test
   void test_ninjaTraining_expect110_whenNumberOfDaysIs2() {
      int[][] trainingDays = {
         {10, 5, 1},
         {5, 100, 11}
      };
      Assertions.assertEquals(110, classObj.ninjaTraining(2, trainingDays));
   }
}
