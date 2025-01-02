package practice.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class RightRotateArray {

   public ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
      int n = arr.size();
      k = k % n;
      for (int i = 0; i < k; i++) {
         int lastElement = arr.remove(n - 1);
         arr.add(0, lastElement);
      }
      return arr;
   }

   public ArrayList<Integer> rotateArrayOptimised(ArrayList<Integer> arr, int k) {
      int n = arr.size();
      k = k % n;
      reverse(arr, n - k, n - 1);
      reverse(arr, 0, n - k - 1);
      reverse(arr, 0, n - 1);
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
