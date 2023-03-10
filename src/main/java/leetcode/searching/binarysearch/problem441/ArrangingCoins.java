package leetcode.searching.binarysearch.problem441;

public class ArrangingCoins {

    public int arrangeCoins(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n - i >= 0) {
                count++;
                n -= i;
            } else {
                break;
            }
        }
        return count;
    }
}
