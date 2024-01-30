package practice.arraysandstrings;

public class StringRotation {


   public boolean isSubstring(String s1, String s2) {
      String combined = s1 + s1;
      return combined.contains(s2);
   }

}
