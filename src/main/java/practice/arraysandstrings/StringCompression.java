package practice.arraysandstrings;

public class StringCompression {


   public String compress(String str) {
      StringBuilder output = new StringBuilder();
      output.append(str.charAt(0));
      int characterCount = 1;
      for (int i = 1; i < str.length(); i++) {
         if (str.charAt(i) == str.charAt(i - 1)) {
            characterCount++;
         } else {
            output.append(characterCount);
            output.append(str.charAt(i));
            characterCount = 1;
         }
      }
      output.append(characterCount);
      return output.length() >= str.length() ? str : output.toString();
   }

}
