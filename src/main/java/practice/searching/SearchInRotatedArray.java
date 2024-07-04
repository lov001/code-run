package practice.searching;

public class SearchInRotatedArray {

   public int search(int[] array, int start, int end, int number) {
      int middle = start + (end - start) / 2;
      if (array[middle] == number) {
         return middle;
      }
      if (end < start) {
         return -1;
      }
      if (array[middle] > array[start]) {
         // left side is normally sorted
         if (number >= array[start] && number < array[middle]) {
            return search(array, start, middle - 1, number);      // search left
         } else {
            return search(array, middle + 1, end, number);       // search right
         }
      } else if (array[middle] < array[start]) {
         // right side is normally sorted
         if (number > array[middle] && number <= array[end]) {
            return search(array, middle + 1, end, number);      // search right
         } else {
            return search(array, start, middle - 1, number);     // search left
         }
      } else if (array[start] == array[middle]) {
         // left and right half has repeating elements
         if (array[middle] != array[end]) {
            return search(array, middle + 1, end, number);
         } else {
            // search both halves
            int result = search(array, start, middle, number);
            if (result == -1) {
               return search(array, middle + 1, end, number);
            } else {
               return result;
            }
         }
      }
      return -1;
   }
}
