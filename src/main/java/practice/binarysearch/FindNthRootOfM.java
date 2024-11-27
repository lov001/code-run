package practice.binarysearch;

public class FindNthRootOfM {

   public int NthRootBruteForce(int n, int m) {
      for (int i = 1; i < m; i++) {
         double number = Math.pow(i, n);
         if (number == m) {
            return i;
         } else if (number > m) {
            break;
         }
      }
      return -1;
   }

   public int NthRoot(int n, int m) {
      int low = 1;
      int high = m;
      while (low <= high) {
         int middle = low + (high - low) / 2;
         double number = Math.pow(middle, n);
         if (number == m) {
            return middle;
         } else if (number > m) {
            high = middle - 1;
         } else {
            low = middle + 1;
         }
      }
      return -1;
   }
}
