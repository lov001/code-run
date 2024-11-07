package practice.dynamicprogrammingandrecursion;

import java.util.Stack;

public class MaximumRectangleArea {

   public int maximalAreaOfSubMatrixOfAll1(int[][] mat, int n, int m) {
      int maxArea = largestRectangle(mat[0]);
      for (int i = 1; i < n; i++) {
         for (int j = 0; j < m; j++) {
            mat[i][j] = mat[i][j] == 0 ? 0 : mat[i][j] + mat[i - 1][j];
         }
         maxArea = Math.max(maxArea, largestRectangle(mat[i]));
      }
      return maxArea;
   }

   public int largestRectangle(int[] heights) {
      int n = heights.length;
      int[] leftMin = new int[n];
      int[] rightMin = new int[n];
      Stack<Integer> stack = new Stack<>();
      for (int i = 0; i < n; i++) {
         while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
            stack.pop();
         }
         if (stack.isEmpty()) {
            leftMin[i] = 0;
         } else {
            leftMin[i] = stack.peek() + 1;
         }
         stack.push(i);
      }
      while (!stack.isEmpty()) {
         stack.pop();
      }
      int area = 0;
      for (int i = n - 1; i >= 0; i--) {
         while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
            stack.pop();
         }
         if (stack.isEmpty()) {
            rightMin[i] = n - 1;
         } else {
            rightMin[i] = stack.peek() - 1;
         }
         int temp = (rightMin[i] - leftMin[i] + 1) * heights[i];
         area = Math.max(area, temp);
         stack.push(i);
      }
      return area;
   }
}
