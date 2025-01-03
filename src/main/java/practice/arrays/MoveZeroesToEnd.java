package practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroesToEnd {

   public int[] moveZerosBruteForce(int n, int[] a) {
      List<Integer> temp = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         if (a[i] != 0) {
            temp.add(a[i]);
         }
      }
      int i = 0;
      while (!temp.isEmpty()) {
         a[i] = temp.remove(0);
         i++;
      }
      for (; i < n; i++) {
         a[i] = 0;
      }
      return a;
   }

   public int[] moveZerosOptimised(int n, int[] a) {
      int i = 0;
      int j = 0;
      for (; i < n; i++) {
         if (a[i] != 0 && a[j] == 0) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j++;
         } else if (a[i] != 0 && a[j] != 0) {
            j++;
         }
      }
      return a;
   }
}
