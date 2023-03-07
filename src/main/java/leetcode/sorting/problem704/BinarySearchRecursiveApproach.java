package leetcode.sorting.problem704;

public class BinarySearchRecursiveApproach {

    public int search(int[] nums, int target) {
        return recursiveBinarySearch(nums, 0, nums.length - 1, target);
    }

    private int recursiveBinarySearch(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target < nums[mid]) {
            return recursiveBinarySearch(nums, start, mid - 1, target);
        } else if (target > nums[mid]) {
            return recursiveBinarySearch(nums, mid + 1, end, target);
        }
        return mid;
    }
}
