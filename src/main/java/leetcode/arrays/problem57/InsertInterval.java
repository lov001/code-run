package leetcode.arrays.problem57;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int length = intervals.length;
        int[][] output = new int[length][length];
        int firstIndex = -1, lastIndex = -1, i=0;
        for (i = 0; i < length - 2; i++) {
            if (intervals[i][0] < newInterval[i] && newInterval[i] <= intervals[i + 1][0]) {
                firstIndex = i;
                break;
            }
        }
        for (int j=i; j < length - 2; j++) {
            if (intervals[i][0] < newInterval[i] && newInterval[i] <= intervals[i + 1][0]) {
                firstIndex = i;
                break;
            }
        }
        return output;
    }
}
