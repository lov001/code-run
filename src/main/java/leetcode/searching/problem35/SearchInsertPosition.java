package leetcode.searching.problem35;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int beg = 0, end = nums.length - 1;
        int mid = 0;
        while (beg < end) {
            mid = beg + (end - beg) / 2;
            if (nums[mid] < target) {
                beg = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        if (beg == end && beg == 0) {
            return target > nums[beg] ? 1 : 0;
        } else if (beg == end && beg == nums.length - 1) {
            return nums.length;
        }
        return mid;
    }
}
