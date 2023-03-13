package leetcode.searching.binarysearch.problem69;

public class SquareRoot {

    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
