package leetcode.arrays.problem169;

public class MajorityElementApproach3MooreVotingAlgorithm {

    public int majorityElement(int[] nums) {
        int majority = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
            }
            if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == majority) {
                count++;
            }
        }
        return count > nums.length / 2 ? majority : 0;
    }
}
