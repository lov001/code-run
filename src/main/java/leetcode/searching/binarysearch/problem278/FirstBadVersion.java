package leetcode.searching.binarysearch.problem278;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        long left = 1, right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            boolean isBadVersion = isBadVersion(n, mid);
            if (isBadVersion) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) left;
    }

    private boolean isBadVersion(int n, long num) {
        if (n == 5 && num >= 4) {
            return true;
        } else if (n == 1) {
            return true;
        }
        return false;
    }
}
