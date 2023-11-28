package leetcode.searching.binarysearch.problem744;

public class NextGreatestLetterUsingBinarySearch {


   public char nextGreatestLetter(char[] letters, char target) {
      int start = 0, end = letters.length - 1;

      while (start <= end) {
         int mid = start + (end - start) / 2;
         if (letters[mid] < target) {
            start = mid + 1;
         } else if (letters[mid] > target) {
            end = mid - 1;
         } else {
            while (mid < letters.length) {
               if (letters[mid] > target) {
                  return letters[mid];
               } else if (letters[mid] == target) {
                  mid++;
               } else {
                  break;
               }
            }
            return letters[mid + 1 >= letters.length ? 0 : mid + 1];
         }
      }
      if (start == 0 || start == letters.length) {
         return letters[0];
      } else {
         return letters[start];
      }
   }
}
