package practice.dynamicprogramming;

public class MagicIndex {

   public int magicIndexBF(int[] array) {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == i) {
            return i;
         }
      }
      return -1;
   }

   public int magicIndexUsingBinarySearch(int[] array) {
      return search(array, 0, array.length - 1);
   }

   private int search(int[] array, int start, int end) {
      if (start > end) {
         return -1;
      }
      int midIndex = (start + end) / 2;
      int midValue = array[midIndex];

      if (midValue == midIndex) {
         return midIndex;
      }

      int leftIndex = Math.min(midIndex - 1, midValue);
      int left = search(array, start, leftIndex);
      if (left >= 0) {
         return left;
      }

      int rightIndex = Math.max(midIndex + 1, midValue);
      return search(array, rightIndex, end);
   }
}
