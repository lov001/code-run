package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {

   public String getPermutation(int n, int k) {
      List<Integer> list = new ArrayList<>();
      int factorial = 1;
      for (int i = 1; i < n; i++) {
         factorial *= i;
         list.add(i);
      }
      list.add(n);
      k = k - 1;
      StringBuilder ans = new StringBuilder();
      while (true) {
         ans.append(list.get(k / factorial));
         list.remove(k / factorial);
         if (list.size() == 0) {
            break;
         }
         k = k % factorial;
         factorial = factorial / list.size();
      }
      return ans.toString();
   }
}
