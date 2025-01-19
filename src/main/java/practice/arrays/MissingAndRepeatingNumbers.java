package practice.arrays;

public class MissingAndRepeatingNumbers {

   public int[] findMissingRepeatingNumbersXor(int[] a) {
      int n = a.length;
      int xor = 0;
      for (int i = 0; i < n; i++) {
         xor = xor ^ a[i];
         xor = xor ^ (i + 1);
      }
      int bitNumber = (xor & ~(xor - 1));
      int zeroGroup = 0;
      int oneGroup = 0;
      for (int number : a) {
         if ((number & bitNumber) != 0) {
            oneGroup = oneGroup ^ number;
         }
         //part of 0 group:
         else {
            zeroGroup = zeroGroup ^ number;
         }
      }
      for (int i = 1; i <= n; i++) {
         //part of 1 group:
         if ((i & bitNumber) != 0) {
            oneGroup = oneGroup ^ i;
         }
         //part of 0 group:
         else {
            zeroGroup = zeroGroup ^ i;
         }
      }
      int cnt = 0;
      for (int element : a) {
         if (element == zeroGroup) {
            cnt++;
         }
      }

      if (cnt == 2) {
         return new int[]{zeroGroup, oneGroup};
      }
      return new int[]{oneGroup, zeroGroup};
   }

   public int[] findMissingRepeatingNumbersMathOperations(int[] a) {
      int[] result = new int[2];
      int n = a.length;
      long expectedSum = ((long) n * (n + 1)) / 2;
      long actualSum = 0;
      long expectedSquaredSum = (n * (n + 1) * (2L * n + 1)) / 6;
      long actualSquaredSum = 0;
      for (int number : a) {
         actualSum += number;
         actualSquaredSum += (long) number * number;
      }
      long value1 = actualSum - expectedSum;
      long value2 = actualSquaredSum - expectedSquaredSum;
      value2 = value2 / value1;
      long x = (value1 + value2) / 2;
      long y = x - value1;
      result[0] = (int) x;
      result[1] = (int) y;
      return result;
   }

   public int[] findMissingRepeatingNumbersHashing(int[] a) {
      int[] result = new int[2];
      int n = a.length;
      int[] countMap = new int[n + 1];
      for (int element : a) {
         countMap[element]++;
      }
      int missing = -1;
      int repeated = -1;
      for (int i = 1; i <= n; i++) {
         if (countMap[i] == 2) {
            missing = i;
         } else if (countMap[i] == 0) {
            repeated = i;
         }
         if (missing != -1 && repeated != -1) {
            break;
         }
      }
      result[0] = missing;
      result[1] = repeated;
      return result;
   }

   public int[] findMissingRepeatingNumbersBruteForce(int[] a) {
      int[] result = new int[2];
      int n = a.length;
      for (int i = 1; i <= n; i++) {
         int count = 0;
         for (int index : a) {
            if (index == i) {
               count++;
            }
         }
         if (count == 2) {
            result[0] = i;
         } else if (count == 0) {
            result[1] = i;
         }
      }
      return result;
   }
}
