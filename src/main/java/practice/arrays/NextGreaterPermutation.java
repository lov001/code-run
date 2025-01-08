package practice.arrays;

import java.util.Collections;
import java.util.List;

public class NextGreaterPermutation {

   public List<Integer> nextGreaterPermutation(List<Integer> number) {
      int n = number.size();
      int index = -1;
      for (int i = n - 2; i >= 0; i--) {
         if (number.get(i) < number.get(i + 1)) {
            index = i;
            break;
         }
      }
      if (index == -1) {
         Collections.reverse(number);
         return number;
      }
      for (int i = n - 1; i > index; i--) {
         if (number.get(i) > number.get(index)) {
            int temp = number.get(i);
            number.set(i, number.get(index));
            number.set(index, temp);
            break;
         }
      }
      List<Integer> sublist = number.subList(index + 1, n);
      Collections.reverse(sublist);
      return number;
   }
}
