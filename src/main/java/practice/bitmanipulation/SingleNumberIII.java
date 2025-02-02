package practice.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class SingleNumberIII {

   public List<Integer> twoNonRepeatingElements(int[] arr, int n) {
      int xor = 0;
      for (int i = 0; i < n; i++) {
         xor = xor ^ arr[i];
      }
      int rightmost;
      if (xor == Integer.MIN_VALUE) {
         rightmost = Integer.MIN_VALUE;
      } else {
         rightmost = (xor & (xor - 1)) ^ xor;
      }

      int bucket1 = 0, bucket2 = 0;
      for (int number : arr) {
         if ((number & rightmost) != 0) {
            bucket1 = bucket1 ^ number;
         } else {
            bucket2 = bucket2 ^ number;
         }
      }
      List<Integer> result = new ArrayList<>();
      if (bucket1 < bucket2) {
         result.add(bucket1);
         result.add(bucket2);
         System.out.println(bucket1 + " " + bucket2);
      } else {
         result.add(bucket2);
         result.add(bucket1);
         System.out.println(bucket2 + " " + bucket1);
      }
      return result;
   }
}
