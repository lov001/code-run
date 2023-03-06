package leetcode.arrays.problem1539;

public class KthMissingNumber {

    public int findKthPositive(int[] arr, int k) {
        int number = 1;
        int index = 0;
        for (int i = 1; i < arr[arr.length - 1]; i++) {
            if (arr[index] != i) {
                number = i;
                k--;
            } else {
                index++;
            }
            if (k == 0 || index == arr.length) {
                break;
            }
        }
        if (k != 0 && (index + 1) == arr.length) {
            number = arr[index] + k;
        }
        return number;
    }
}
