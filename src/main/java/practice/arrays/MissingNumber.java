package practice.arrays;

public class MissingNumber {

   public int missingNumber(int[] a, int N) {
      int expectedSum = N * (N + 1) / 2;
      int actualSum = 0;
      for (int number : a) {
         actualSum += number;
      }
      return expectedSum - actualSum;
   }

   public int missingNumberWithXor(int[] a, int N) {
      int xor1 = 0;
      int xor2 = 0;
      for (int i = 0; i < N - 1; i++) {
         xor2 = xor2 ^ a[i];
         xor1 = xor1 ^ (i + 1);
      }
      xor2 = xor2 ^ N;
      return xor1 ^ xor2;
   }
}
