package practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraysWithXorK {

   public int subArraysWithXorK(int[] a, int b) {
      int count = 0;
      Map<Integer, Integer> map = new HashMap<>();
      int xor = 0;
      map.put(0, 1);
      for (int element : a) {
         xor = xor ^ element;
         int remainingXor = xor ^ b;
         count += map.getOrDefault(remainingXor, 0);
         map.put(xor, map.getOrDefault(xor, 0) + 1);

      }
      return count;
   }

   public int subArraysWithXorKBruteForce(int[] a, int b) {
      int n = a.length;
      int count = 0;
      for (int i = 0; i < n; i++) {
         int xor = 0;
         for (int j = i; j < n; j++) {
            xor = xor ^ a[j];
            if (xor == b) {
               count++;
            }
         }
      }
      return count;
   }
}
