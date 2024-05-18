package practice.bitmanipulation;

public class BinaryToString {

   public String convertBinaryToString(double number) {
      if (number >= 1 || number <= 0) {
         return "ERROR";
      }
      StringBuilder builder = new StringBuilder();
      builder.append(".");
      while (number > 0) {
         if (builder.length() >= 32) {
            return "ERROR";
         }
         double r = number * 2;
         if (r >= 1) {
            builder.append("1");
            number = r - 1;
         } else {
            builder.append("0");
            number = r;
         }
      }
      return builder.toString();
   }
}
