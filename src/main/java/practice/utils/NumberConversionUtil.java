package practice.utils;

public class NumberConversionUtil {

   public static String convertDecimalToBinary(int number) {
      if (number <= 0) {
         return "";
      }
      StringBuilder builder = new StringBuilder();
      while (number > 0) {
         int remainder = number % 2;
         builder.append(remainder);
         number = number / 2;
      }
      return builder.reverse().toString();
   }
}
