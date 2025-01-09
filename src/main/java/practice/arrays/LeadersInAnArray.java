package practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {

   public List<Integer> superiorElements(int[] a) {
      List<Integer> result = new ArrayList<>();
      int n = a.length;
      int maxElement = a[n - 1];
      result.add(maxElement);
      for (int i = n - 2; i >= 0; i--) {
         if (a[i] > maxElement) {
            result.add(a[i]);
            maxElement = a[i];
         }
      }
      return result;
   }
}
