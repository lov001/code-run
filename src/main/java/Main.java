import java.util.Arrays;
import leetcode.problem283.MoveZeroesToEnd;

public class Main {

    public static void main(String[] args) {
        MoveZeroesToEnd object = new MoveZeroesToEnd();
        int[] input = {0, 1, 0, 3, 12};
        System.out.println("Output: -> " + Arrays.toString(object.moveZeroes(input)));
    }
}