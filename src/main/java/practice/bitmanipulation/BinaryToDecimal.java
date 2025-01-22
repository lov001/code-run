package practice.bitmanipulation;

public class BinaryToDecimal {

   public int convert(int N, String str) {
      int number = 0;
      for (int i = 0; i < N; i++) {
         double power = Math.pow(2, N - i - 1);
         int num = Integer.parseInt(String.valueOf(str.charAt(i)));
         number += num * power;
      }
      return number;
   }
}
