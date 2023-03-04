package leetcode.strings.problem657;

public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {
        int leftRight = 0, upDown = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            if (ch == 'U') {
                upDown += 1;
            } else if (ch == 'R') {
                leftRight += 1;
            } else if (ch == 'D') {
                upDown -= 1;
            } else if (ch == 'L') {
                leftRight -= 1;
            }
        }
        return upDown == 0 && leftRight == 0;
    }
}
