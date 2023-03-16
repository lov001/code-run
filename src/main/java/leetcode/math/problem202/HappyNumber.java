package leetcode.math.problem202;

import java.util.Arrays;

public class HappyNumber {

    public boolean isHappy(int n) {
        String[] numArray = String.valueOf(n).split("");
        int sum;
        while (true) {
            sum = Arrays.stream(numArray)
                .mapToInt(number -> Integer.parseInt(number) * Integer.parseInt(number)).sum();
            if (sum > 6) {
                numArray = String.valueOf(sum).split("");
            } else {
                break;
            }
        }
        return sum == 1;
    }
}
