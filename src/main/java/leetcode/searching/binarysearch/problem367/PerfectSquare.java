package leetcode.searching.binarysearch.problem367;

public class PerfectSquare {

    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        long left = 1, right = num / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
