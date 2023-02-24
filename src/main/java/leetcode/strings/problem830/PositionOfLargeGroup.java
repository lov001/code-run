package leetcode.strings.problem830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionOfLargeGroup {

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> output = new ArrayList<>();
        char prev = s.charAt(0);
        int start = 0, count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (prev != s.charAt(i)) {
                if (count >= 3) {
                    output.add(Arrays.asList(start, start + count - 1));
                }
                prev = s.charAt(i);
                count = 1;
                start = i;
            } else {
                count++;
            }
        }
        return output;
    }
}
