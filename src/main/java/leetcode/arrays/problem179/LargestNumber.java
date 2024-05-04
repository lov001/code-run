package leetcode.arrays.problem179;

import java.util.Arrays;
import java.util.Objects;

public class LargestNumber {

   public String largestNumber(int[] nums) {
      String[] strArray = new String[nums.length];
      for (int i = 0; i < nums.length; i++) {
         strArray[i] = String.valueOf(nums[i]);
      }
      Arrays.sort(strArray, (x, y) -> {
         String XY = x + y;
         String YX = y + x;
         return YX.compareTo(XY);
      });
      StringBuilder stringBuilder = new StringBuilder();
      for (String num : strArray) {
         stringBuilder.append(num);
      }
      if (Objects.equals(strArray[0], "0")) {
         return "0";
      }
      return stringBuilder.toString();
   }
}
