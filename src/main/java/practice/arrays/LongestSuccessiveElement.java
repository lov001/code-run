package practice.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSuccessiveElement {

   public int longestSuccessiveElementsOptimal(int[] a) {
      Set<Integer> set = new HashSet<>();
      for (int element : a) {
         set.add(element);
      }
      int length = 1;
      for (Integer element : set) {
         if (!set.contains(element - 1)) {
            int count = 1;
            int num = element;
            while (set.contains(num + 1)) {
               count++;
               num = num + 1;
            }
            length = Math.max(length, count);
         }
      }
      return length;
   }

   public int longestSuccessiveElementsUsingSorting(int[] a) {
      int longest = 1;
      int smallest = Integer.MIN_VALUE;
      int count = 0;
      Arrays.sort(a);
      for (int element : a) {
         if ((element - 1) == smallest) {
            count++;
            smallest = element;
         } else if (element != smallest) {
            count = 1;
            smallest = element;
         }
         longest = Math.max(longest, count);
      }
      return longest;
   }

   public int longestSuccessiveElementsBruteForce(int[] a) {
      int longest = 1;
      for (int j : a) {
         int count = 1;
         int element = j + 1;
         while (findElement(a, element)) {
            count++;
            element = element + 1;
         }
         longest = Math.max(longest, count);
      }
      return longest;
   }

   private boolean findElement(int[] a, int element) {
      for (int j : a) {
         if (j == element) {
            return true;
         }
      }
      return false;
   }
}
