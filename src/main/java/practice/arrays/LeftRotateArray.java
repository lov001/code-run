package practice.arrays;

import java.util.ArrayList;
import java.util.Collections;

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

   public ArrayList<Integer> rotateArrayOptimised(ArrayList<Integer> arr, int k) {
      int n = arr.size();
      k = k % n;
      reverse(arr, 0, k - 1);
      reverse(arr, k, n - 1);
      reverse(arr, 0, n - 1);
//      for (int i = 0; i < k; i++) {
////         int temp = arr.get(i);
////         arr.set(i, arr.get(k - i - 1));
////         arr.set(k - i - 1, temp);
//      }
//      int temp = 1;
//      for (int i = k; i < n; i++) {
//         int tempV = arr.get(i);
//         arr.set(i, arr.get(n - temp));
//         arr.set(n - temp, tempV);
//         temp++;
//      }
//      for (int i = 0; i < n; i++) {
//         int tempV = arr.get(i);
//         arr.set(i, arr.get(n - i - 1));
//         arr.set(n - i - 1, tempV);
//      }
      return arr;
   }

   private void reverse(ArrayList<Integer> arr, int start, int end) {
      while (start < end) {
         Collections.swap(arr, start, end);
         start++;
         end--;
      }
   }
}
