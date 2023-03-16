package leetcode.math.problem202;


public class HappyNumberUsingCycleDetectionAlgorithm {

    public boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = doSum(slow);
            fast = doSum(fast);
            fast = doSum(fast);
        } while (slow != fast);
        return slow == 1;
    }

    private int doSum(int n) {
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum += remainder * remainder;
            n /= 10;
        }
        return sum;
    }
}
