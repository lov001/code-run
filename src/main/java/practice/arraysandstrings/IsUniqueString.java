package practice.arraysandstrings;

public class IsUniqueString {


   private static final int MAX_STRING_SIZE = 128;

   /**
    * @param str - It will a string input. Here the assumption is made that it is an ASCII string so
    *            the max unique characters it can take is 128. If we change our assumption or
    *            use-case, update the size accordingly.
    * @return boolean
    */
   public boolean isUniqueString(String str) {
      if (str.length() > MAX_STRING_SIZE) {
         return false;
      }
      boolean[] char_array = new boolean[MAX_STRING_SIZE];
      for (int i = 0; i < str.length(); i++) {
         int value = str.charAt(i);
         if(char_array[value]){
            return false;
         }
         char_array[value] = true;
      }
      return true;
   }

}
