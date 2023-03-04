package leetcode.strings.problem821;

public class ShortestDistanceToCharacter {

    public int[] shortestToChar(String s, char c) {
        int[] output = new int[s.length()];
        int[] indexArr = new int[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                indexArr[index++] = i;
            }
        }
        int prev = -1, current = 0;
        for (int j = 0; j < s.length(); j++) {
            if (j == indexArr[current]) {
                output[j] = 0;
                prev = current;
                current++;
            } else {
                output[j] = Math.min(Math.abs(indexArr[prev == -1 ? 0 : prev] - j),
                    Math.abs(indexArr[current] - j));
            }
        }
        return output;
    }
}
