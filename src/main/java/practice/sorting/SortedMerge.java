package practice.sorting;

public class SortedMerge {

   public void sortedMerge(int[] array1, int[] array2, int length1, int length2) {
      int index = length1 + length2 - 1;
      int index1 = length1 - 1;
      int index2 = length2 - 1;
      while (index1 >= 0 && index2 >= 0) {
         if (array1[index1] <= array2[index2]) {
            array1[index] = array2[index2];
            index--;
            index2--;
         } else {
            array1[index] = array1[index1];
            index--;
            index1--;
         }
      }
      while (index1 >= 0) {
         array1[index] = array1[index1];
         index1--;
         index--;
      }
      while (index2 >= 0) {
         array1[index] = array2[index2];
         index2--;
         index--;
      }
   }
}
