package leetcode.searching.binarysearch;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int[] output = new int[nums.length + 1];
        for (int number : nums) {
            if (output[number] == 0) {
                output[number] = 1;
            }
        }
        for (int i = 0; i < output.length; i++) {
            if (output[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}
