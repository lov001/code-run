package leetcode.arrays.problem989;

import java.util.ArrayList;
import java.util.List;

public class ArrayFormOfIntegerApproach2 {

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length;
        int carry = 0;
        int i = n - 1;
        while (i >= 0 || k > 0 || carry > 0) {
            int x = i >= 0 ? num[i] : 0;
            int y = k % 10;
            int sum = x + y + carry;
            result.add(0, sum % 10);
            carry = sum / 10;
            i--;
            k /= 10;
        }
        return result;
    }
}
