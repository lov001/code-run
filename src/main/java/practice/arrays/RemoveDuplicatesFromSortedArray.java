package practice.arrays;

public class RemoveDuplicatesFromSortedArray {

   public int removeDuplicates(int[] arr, int n) {
      int index = 1;
      for (int i = 1; i < n; i++) {
         if (arr[i] != arr[index - 1]) {
            arr[index] = arr[i];
            index++;
         }
      }
      return index;
   }
}
