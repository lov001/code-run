package practice.binarysearch;

public class FindSquareRoot {

   public int sqrtN(long N) {
      long low = 1;
      long high = N;
      long ans = -1;
      while (low <= high) {
         long mid = low + (high - low) / 2;
         long square = mid * mid;
         if (square <= N) {
            ans = mid;
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return (int) high;
//      return (int) ans;
   }
}
