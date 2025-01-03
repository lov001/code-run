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
}
