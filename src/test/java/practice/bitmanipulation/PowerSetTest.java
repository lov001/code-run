package practice.bitmanipulation;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerSetTest {

   PowerSet classObj = new PowerSet();

   @Test
   void test_powerSet_expectListOfSize8_whenNIs3() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(2);
      input.add(3);
      ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
      ArrayList<Integer> sublist0 = new ArrayList<>();
      expected.add(sublist0);
      ArrayList<Integer> sublist1 = new ArrayList<>();
      sublist1.add(1);
      expected.add(sublist1);
      ArrayList<Integer> sublist2 = new ArrayList<>();
      sublist2.add(2);
      expected.add(sublist2);
      ArrayList<Integer> sublist3 = new ArrayList<>();
      sublist3.add(3);
      ArrayList<Integer> sublist4 = new ArrayList<>();
      sublist4.add(1);
      sublist4.add(2);
      expected.add(sublist4);
      expected.add(sublist3);
      ArrayList<Integer> sublist5 = new ArrayList<>();
      sublist5.add(1);
      sublist5.add(3);
      expected.add(sublist5);
      ArrayList<Integer> sublist6 = new ArrayList<>();
      sublist6.add(2);
      sublist6.add(3);
      expected.add(sublist6);
      ArrayList<Integer> sublist7 = new ArrayList<>();
      sublist7.add(1);
      sublist7.add(2);
      sublist7.add(3);
      expected.add(sublist7);
      ArrayList<ArrayList<Integer>> actual = classObj.powerSet(input);
      Assertions.assertArrayEquals(new ArrayList[]{expected}, new ArrayList[]{actual});
   }
}
