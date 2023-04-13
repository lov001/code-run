package leetcode.queue.problem387;

public class FirstUniqueCharacterApproach2 {

    public int firstUniqueChar(String s) {
        for (char ch : s.toCharArray()) {
            int index = s.indexOf(ch);
            int lastIndex = s.lastIndexOf(ch);
            if (index == lastIndex) {
                return index;
            }
        }
        return -1;
    }
}
