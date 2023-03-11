package leetcode.searching.binarysearch.problem367;

public class PerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return false;
        }
        int left = 2, right = num / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int square = mid * mid;
            if (square < num) {
                left = mid + 1;
            } else if (square > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
