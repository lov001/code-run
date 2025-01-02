package practice.arrays;

public class LeftRotateArrayByOne {

   public int[] rotateArray(int[] arr, int n) {
      if (n == 1) {
         return arr;
      }
      int first = arr[0];
      for (int i = 1; i < n; i++) {
         arr[i - 1] = arr[i];
      }
      arr[n - 1] = first;
      return arr;
   }
}
