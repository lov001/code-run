package practice.arraysandstrings;

import java.util.ArrayList;
import java.util.Stack;

public class LargestRectangleInHistogram {

   public int largestRectangleArea(ArrayList<Integer> arr, int n) {
      int maxArea = 0;
      for (int i = 0; i < n; i++) {
         int minHeight = Integer.MAX_VALUE;
         for (int j = i; j < n; j++) {
            minHeight = Math.min(minHeight, arr.get(j));
            maxArea = Math.max(maxArea, minHeight * (j - i + 1));
         }
      }
      return maxArea;
   }

   public int largestRectangle(ArrayList<Integer> heights) {
      int n = heights.size();
      int[] left = new int[n];
      int[] right = new int[n];
      Stack<Integer> stack = new Stack<>();
      for (int i = 0; i < n; i++) {
         while (!stack.isEmpty() && heights.get(stack.peek()) >= heights.get(i)) {
            stack.pop();
         }
         if (stack.isEmpty()) {
            left[i] = 0;
         } else {
            left[i] = stack.peek() + 1;
         }
         stack.push(i);
      }
      while (!stack.isEmpty()) {
         stack.pop();
      }
      for (int i = n - 1; i >= 0; i--) {
         while (!stack.isEmpty() && heights.get(stack.peek()) >= heights.get(i)) {
            stack.pop();
         }
         if (stack.isEmpty()) {
            right[i] = n - 1;
         } else {
            right[i] = stack.peek() - 1;
         }
         stack.push(i);
      }
      int area = 0;
      for (int i = 0; i < n; i++) {
         int temp = (right[i] - left[i] + 1) * heights.get(i);
         area = Math.max(area, temp);
      }
      return area;
   }
}
