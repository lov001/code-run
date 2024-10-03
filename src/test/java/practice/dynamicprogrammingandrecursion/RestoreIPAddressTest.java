package practice.dynamicprogrammingandrecursion;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestoreIPAddressTest {

   RestoreIPAddress classObj = new RestoreIPAddress();

   @Test
   void test_restoreIpAddresses_expectOutputOfSize2_whenGivenString() {
      String ip = "25525511135";
      List<String> expected = List.of("255.255.11.135", "255.255.111.35");
      List<String> actual = classObj.restoreIpAddresses(ip);
      Assertions.assertEquals(expected.size(), actual.size());
      Assertions.assertEquals(expected.get(0), actual.get(0));
      Assertions.assertEquals(expected.get(1), actual.get(1));
   }

   @Test
   void test_restoreIpAddresses_expectOutputOfSize1_whenGivenStringOfAll0s() {
      String ip = "0000";
      List<String> expected = List.of("0.0.0.0");
      List<String> actual = classObj.restoreIpAddresses(ip);
      Assertions.assertEquals(expected.size(), actual.size());
      Assertions.assertEquals(expected.get(0), actual.get(0));
   }

   @Test
   void test_restoreIpAddresses_expectOutputOfSize5_whenGivenString() {
      String ip = "101023";
      List<String> expected = List.of("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3",
         "101.0.2.3");
      List<String> actual = classObj.restoreIpAddresses(ip);
      Assertions.assertEquals(expected.size(), actual.size());
      Assertions.assertEquals(expected.get(0), actual.get(0));
      Assertions.assertEquals(expected.get(1), actual.get(1));
      Assertions.assertEquals(expected.get(2), actual.get(2));
      Assertions.assertEquals(expected.get(3), actual.get(3));
      Assertions.assertEquals(expected.get(4), actual.get(4));
   }
}
