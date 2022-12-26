import java.util.Arrays;
import leetcode.MoveZeroesToEnd;

public class Main {

    public static void main(String[] args) {
        MoveZeroesToEnd object = new MoveZeroesToEnd();
        int[] input = {1,0};
        System.out.println("Output: -> " + Arrays.toString(object.moveZeroes(input)));
    }
}