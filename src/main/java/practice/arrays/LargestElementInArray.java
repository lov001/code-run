package practice.arrays;

public class LargestElementInArray {

   public int largestElement(int[] arr, int n) {
      int max = arr[0];
      for (int i = 1; i < n; i++) {
         if(arr[i] > max){
            max = arr[i];
         }
      }
      return max;
   }
}
