package leetcode.searching.binarysearch.problem441;

public class ArrangingCoinsApproach2 {

    public int arrangeCoins(int n) {
        long left = 0, right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long nSum = (mid * (mid + 1)) / 2;
            if (nSum - n > 0) {
                right = mid - 1;
            } else if (nSum - n < 0) {
                left = mid + 1;
            } else {
                return (int) mid;
            }
        }
        return (int) right;
    }
}
