package practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

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

   public List<Integer> nextGreaterPermutationBruteForce(List<Integer> numbers) {
      int n = numbers.size();
      Set<List<Integer>> uniquePermutations = new HashSet<>();
      permutations(0, uniquePermutations, numbers, n);
      List<List<Integer>> permutations = new ArrayList<>(uniquePermutations);
      permutations.sort((list1, list2) -> {
         long num1 = formNumber(list1);
         long num2 = formNumber(list2);
         return Long.compare(num1, num2);
      });
      int size = permutations.size();
      int index = IntStream.range(0, permutations.size())
         .filter(i -> formNumber(permutations.get(i)) == formNumber(numbers))
         .findFirst()
         .orElse(-1);
      if (index == size - 1) {
         return permutations.get(0);
      }
      return permutations.get(index + 1);
   }

   private void permutations(int index, Set<List<Integer>> permutations, List<Integer> numbers,
      int n) {
      if (index == n) {
         List<Integer> temp = new ArrayList<>();
         for (Integer num : numbers) {
            temp.add(num);
         }
         permutations.add(temp);
         return;
      }
      for (int i = index; i < n; i++) {
         int temp = numbers.get(i);
         numbers.set(i, numbers.get(index));
         numbers.set(index, temp);

         permutations(index + 1, permutations, numbers, n);

         int temp2 = numbers.get(i);
         numbers.set(i, numbers.get(index));
         numbers.set(index, temp2);
      }
   }

   private static long formNumber(List<Integer> list) {
      long number = 0;
      for (int digit : list) {
         number = number * 10 + digit;
      }
      return number;
   }
}
