package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberIITest {

   HouseRobberII classObj = new HouseRobberII();

   @Test
   void test_houseRobber_expect3_whenNumberOfHousesIs3() {
      int[] valueInHouses = {2, 3, 2};
      Assertions.assertEquals(3, classObj.houseRobber(valueInHouses));
      Assertions.assertEquals(3, classObj.houseRobberWithTabulation(valueInHouses));
   }

   @Test
   void test_houseRobber_expect4_whenNumberOfHousesIs4() {
      int[] valueInHouses = {1, 2, 3, 1};
      Assertions.assertEquals(4, classObj.houseRobber(valueInHouses));
      Assertions.assertEquals(4, classObj.houseRobberWithTabulation(valueInHouses));
   }

   @Test
   void test_houseRobber_expect0_whenNumberOfHousesIs0() {
      int[] valueInHouses = {0};
      Assertions.assertEquals(0, classObj.houseRobber(valueInHouses));
      Assertions.assertEquals(0, classObj.houseRobberWithTabulation(valueInHouses));
   }

   @Test
   void test_houseRobber_expect11_whenNumberOfHousesIs5() {
      int[] valueInHouses = {1, 5, 1, 2, 6};
      Assertions.assertEquals(11, classObj.houseRobber(valueInHouses));
      Assertions.assertEquals(11, classObj.houseRobberWithTabulation(valueInHouses));
   }

   @Test
   void test_houseRobber_expect5_whenNumberOfHousesIs3() {
      int[] valueInHouses = {2, 3, 5};
      Assertions.assertEquals(5, classObj.houseRobber(valueInHouses));
      Assertions.assertEquals(5, classObj.houseRobberWithTabulation(valueInHouses));
   }

   @Test
   void test_houseRobber_expect3_whenNumberOfHousesIs4() {
      int[] valueInHouses = {1, 3, 2, 0};
      Assertions.assertEquals(3, classObj.houseRobber(valueInHouses));
      Assertions.assertEquals(3, classObj.houseRobberWithTabulation(valueInHouses));
   }
}
