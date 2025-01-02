package practice.arrays;

import java.util.ArrayList;

public class LeftRotateArray {

   public int[] rotateArrayByOne(int[] arr, int n) {
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

   public ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
      int n = arr.size();
      k = k % n;
      int[] temp = new int[k];
      for (int i = 0; i < k; i++) {
         temp[i] = arr.get(i);
      }
      for (int i = k; i < n; i++) {
         arr.set(i - k, arr.get(i));
      }
      for (int i = n - k; i < n; i++) {
         arr.set(i, temp[i - (n - k)]);
      }
      return arr;
   }
}
