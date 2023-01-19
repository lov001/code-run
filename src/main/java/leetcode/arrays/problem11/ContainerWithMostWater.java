package leetcode.arrays.problem11;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}
