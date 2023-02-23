package leetcode.strings.problem1078;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {

    public String[] findOccurrences(String text, String first, String second) {
        String[] stringArray = text.split(" ");
        int strLength = stringArray.length;
        List<String> output = new ArrayList<>();
        for (int i = 1; i < strLength; i++) {
            if (stringArray[i - 1].equals(first) && stringArray[i].equals(second)
                && (i + 1) != strLength) {
                output.add(stringArray[i + 1]);
            }
        }
        return output.toArray(new String[0]);
    }
}
