package leetcode.searching.problem35;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int beg = 0, end = nums.length - 1;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return beg;
    }
}
