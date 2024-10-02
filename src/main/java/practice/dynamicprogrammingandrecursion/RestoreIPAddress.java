package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress {

   public List<String> restoreIpAddresses(String s) {
      List<String> output = new ArrayList<>();
      if (s.length() < 4 || s.length() > 12) {
         return output;
      }
      solve(0, 0, "", s, output);
      return output;
   }

   private void solve(int index, int segmentCount, String ip, String s,
      List<String> output) {

      if (segmentCount == 4 && index == s.length()) {
         output.add(ip);
         return;
      }

      if (segmentCount == 4 || index >= s.length()) {
         return;
      }
      for (int i = 1; i <= 3; i++) {
         if (index + i > s.length()) {
            break;
         }
         String updatedIp = s.substring(index, index + i);
         if (isValidInteger(updatedIp)) {
            solve(index + i, segmentCount + 1, ip.isEmpty() ? updatedIp : ip + "." + updatedIp, s,
               output);
         }
      }
   }

   private boolean isValidInteger(String val) {
      if ("".equals(val) || val.length() > 1 && val.startsWith("0")) {
         return false;
      }
      int number = Integer.parseInt(val);
      return number >= 0 && number <= 255;
   }
}
