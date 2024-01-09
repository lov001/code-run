package practice.arraysandstrings;

public class CheckStringPermutation {

   public static final int MAX_CHARS_LIMIT = 128;
   public boolean checkPermutation(String str1, String str2){
      if(str1.length() != str2.length()){
         return false;
      }
      int[] char_map1 = new int[MAX_CHARS_LIMIT];
      int[] char_map2 = new int[MAX_CHARS_LIMIT];
      for(char ch : str1.toCharArray()){
         char_map1[ch] = char_map1[ch] + 1;
      }
      for(char ch : str2.toCharArray()){
         char_map2[ch] = char_map2[ch] + 1;
      }
      for(int i=0; i<str1.length(); i++){
         if(char_map1[str1.charAt(i)] != char_map2[str2.charAt(i)]){
            return false;
         }
      }
      return true;
   }

}
