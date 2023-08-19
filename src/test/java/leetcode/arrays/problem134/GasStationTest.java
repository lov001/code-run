package leetcode.arrays.problem134;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GasStationTest {


   GasStation classObj = new GasStation();

   @Test
   void test_canCompleteCircuit_expect3_whenInput_1() {
      int[] gas = {1, 2, 3, 4, 5};
      int[] cost = {3, 4, 5, 1, 2};
      Assertions.assertEquals(3, classObj.canCompleteCircuit(gas, cost));
   }

   @Test
   void test_canCompleteCircuit_expectMinusOne_whenInput_1() {
      int[] gas = {2, 3, 4};
      int[] cost = {3, 4, 3};
      Assertions.assertEquals(-1, classObj.canCompleteCircuit(gas, cost));
   }
}
