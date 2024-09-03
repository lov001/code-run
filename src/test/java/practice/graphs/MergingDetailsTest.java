package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergingDetailsTest {

   MergingDetails classObj = new MergingDetails();

   @Test
   void test_mergeDetails_expectOutputOfSize3_whenGivenInput() {
      List<List<String>> input = new ArrayList<>();
      List<String> list1 = List.of("John", "johnsmith@mail.com", "john_newyork@mail.com");
      List<String> list2 = List.of("John", "johnsmith@mail.com", "john00@mail.com");
      List<String> list3 = List.of("Mary", "mary@mail.com");
      List<String> list4 = List.of("John", "johnnybravo@mail.com");
      input.add(list1);
      input.add(list2);
      input.add(list3);
      input.add(list4);
      List<List<String>> output = new ArrayList<>();
      List<String> list11 = List.of("John", "john00@mail.com", "john_newyork@mail.com",
         "johnsmith@mail.com");
      List<String> list31 = List.of("Mary", "mary@mail.com");
      List<String> list41 = List.of("John", "johnnybravo@mail.com");
      output.add(list11);
      output.add(list31);
      output.add(list41);
      Assertions.assertArrayEquals(new List[]{output}, new List[]{classObj.mergeDetails(input)});
   }

   @Test
   void test_mergeDetails_expectOutputOfSize5_whenGivenInput() {
      List<List<String>> input = new ArrayList<>();
      List<String> list1 = List.of("Gabe","Gabe0@m.co","Gabe3@m.co","Gabe1@m.co");
      List<String> list2 = List.of("Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co");
      List<String> list3 = List.of("Ethan","Ethan5@m.co","Ethan4@m.co","Ethan0@m.co");
      List<String> list4 = List.of("Hanzo","Hanzo3@m.co","Hanzo1@m.co","Hanzo0@m.co");
      List<String> list5 = List.of("Fern","Fern5@m.co","Fern1@m.co","Fern0@m.co");
      input.add(list1);
      input.add(list2);
      input.add(list3);
      input.add(list4);
      input.add(list5);
      List<List<String>> output = new ArrayList<>();
      List<String> list21 = List.of("Gabe","Gabe0@m.co","Gabe1@m.co","Gabe3@m.co");
      List<String> list41 = List.of("Kevin","Kevin0@m.co","Kevin3@m.co","Kevin5@m.co");
      List<String> list11 = List.of("Ethan","Ethan0@m.co","Ethan4@m.co","Ethan5@m.co");
      List<String> list31 = List.of("Hanzo","Hanzo0@m.co","Hanzo1@m.co","Hanzo3@m.co");
      List<String> list51 = List.of("Fern","Fern0@m.co","Fern1@m.co","Fern5@m.co");
      output.add(list21);
      output.add(list41);
      output.add(list11);
      output.add(list31);
      output.add(list51);
      Assertions.assertArrayEquals(new List[]{output}, new List[]{classObj.mergeDetails(input)});
   }
}
