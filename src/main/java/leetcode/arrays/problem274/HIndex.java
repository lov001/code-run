package leetcode.arrays.problem274;

import java.util.Arrays;

public class HIndex {


   public int hIndex(int[] citations) {
      int length = citations.length;
      int start = 0, end = citations.length - 1;
      Arrays.sort(citations);
      while (start <= end) {
         int middle = start + (end - start) / 2;
         if (citations[middle] == (length - middle)) {
            return citations[middle];
         } else if (citations[middle] > (length - middle)) {
            end = middle - 1;
         } else {
            start = middle + 1;
         }
      }
      return length - start;
   }
}
