package practice.bitmanipulation;

import java.util.Arrays;

public class SingleNumberII {

   // TC: O(N)), SC: O(1)
   public int elementThatAppearsOnceUsingBits(int[] arr) {
      int ones = 0, twos = 0;
      for (int element : arr) {
         ones = ones ^ element & ~twos;
         twos = twos ^ element & ~ones;
      }
      return ones;
   }

   // TC: O(N*log(N) + N/3), SC: O(1)
   public int elementThatAppearsOnceUsingSorting(int[] arr) {
      Arrays.sort(arr);
      for (int i = 1; i < arr.length; i = i + 3) {
         if (arr[i - 1] != arr[i]) {
            return arr[i - 1];
         }
      }
      return arr[arr.length - 1];
   }

   // TC: O(N*32), SC: O(1)
   public int elementThatAppearsOnce(int[] arr) {
      int result = 0;
      for (int bitIndex = 0; bitIndex < 32; bitIndex++) {
         int count = 0;
         for (int element : arr) {
            if ((element & (1 << bitIndex)) != 0) {
               count++;
            }
         }
         if (count % 3 == 1) {
            result = result | (1 << bitIndex);
         }
      }
      return result;
   }
}
