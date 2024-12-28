package practice.arrays;

import java.util.Arrays;

public class SecondLargestElementInArray {

   public int secondLargestElement(int[] arr, int n) {
      int secondMax = -1;
      Arrays.sort(arr);
      int max = arr[n - 1];
      for (int i = n - 2; i >= 0; i--) {
         if (arr[i] != max) {
            secondMax = arr[i];
            break;
         }
      }
      return secondMax;
   }
}
