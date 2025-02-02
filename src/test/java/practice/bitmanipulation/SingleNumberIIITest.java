package practice.bitmanipulation;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberIIITest {

   SingleNumberIII classObj = new SingleNumberIII();

   @Test
   void test_twoNonRepeatingElements_expect4And8_whenNIs8() {
      int[] input = {2, 4, 6, 8, 10, 2, 6, 10};
      List<Integer> expected = new ArrayList<>();
      expected.add(4);
      expected.add(8);
      Assertions.assertArrayEquals(new List[]{expected},
         new List[]{classObj.twoNonRepeatingElements(input, 8)});
   }

   @Test
   void test_twoNonRepeatingElements_expect3And5_whenNIs4() {
      int[] input = {-1, -1, 5, 3};
      List<Integer> expected = new ArrayList<>();
      expected.add(3);
      expected.add(5);
      Assertions.assertArrayEquals(new List[]{expected},
         new List[]{classObj.twoNonRepeatingElements(input, 4)});
   }
}
