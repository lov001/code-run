package practice.bitmanipulation;

public class DecimalToBinary {

   public String convert(int N) {
      StringBuilder result = new StringBuilder();
      while (N != 1 && N != 0) {
         result.append(N % 2);
         N = N / 2;
      }
      result.append(N);
      result.reverse();
      return result.toString();
   }
}
