package leetcode.searching.binarysearch.problem374;

public class GreatestNumberHigherOrLower {

    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int guess = guess(n, mid);
            if (guess == 0) {
                return mid;
            } else if (guess == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int guess(int number, int mid) {
        if ((number == 10 && mid == 6) || (number == 1 && mid == 1) || (number == 2 && mid == 1)) {
            return 0;
        } else if (mid < 6) {
            return 1;
        } else {
            return -1;
        }
    }
}
