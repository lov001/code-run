package leetcode.arrays.problem989;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] num, int k) {
        int end = num.length - 1;
        List<Integer> output = new ArrayList<>();
        int carryForward = 0;
        while (k != 0 && end >= 0) {
            int remainder = k % 10;
            int sum = num[end--] + remainder + carryForward;
            output.add(sum > 9 ? sum % 10 : sum);
            carryForward = sum > 9 ? 1 : 0;
            k = k / 10;
        }
        if (carryForward > 0 && end >= 0) {
            while (end >= 0) {
                int sum = num[end--] + carryForward;
                output.add(sum > 9 ? sum % 10 : sum);
                carryForward = sum > 9 ? 1 : 0;
            }
        }
        if (carryForward > 0 && k > 0) {
            int remainder = k % 10;
            int sum = remainder + carryForward;
            output.add(sum > 9 ? 0 : sum);
            carryForward = sum > 9 ? 1 : 0;
            k /= 10;
        }
        while (k > 0) {
            int remainder = k % 10;
            int sum = remainder + carryForward;
            output.add(sum > 9 ? 0 : sum);
            carryForward = sum > 9 ? 1 : 0;
            k = k / 10;
        }
        while (end >= 0) {
            output.add(num[end--]);
        }
        if (carryForward > 0) {
            output.add(carryForward);
        }
        Collections.reverse(output);
        return output;
    }
}
