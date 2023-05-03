package test.javabasic;

import java.util.Stack;

public class DecimalToBinary {

    public static int solution(int A, int B) {
        // Implement your solution here
        // Implement your solution here
        int multiply = A * B;
        StringBuilder str = new StringBuilder();
        while (multiply > 0) {
            str.append(multiply % 2);
            multiply /= 2;
        }
        String binary = str.toString();
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    public static int stackSolution(String s) {
        Stack<Integer> stack = new Stack<>();
        try{
            System.out.println("");
        } finally {

        }
        String[] operations = s.split(" ");
        for (String operation : operations) {
            switch (operation) {
                case "POP": {
                    stack.pop();
                }
                break;
                case "DUP": {
                    stack.push(stack.peek());
                }
                break;
                case "+": {
                    int a = stack.pop();
                    if(stack.size() == 1){
                        return -1;
                    }
                    int b = stack.pop();
                    stack.push(a + b);
                }
                break;
                case "-": {
                    int a = stack.pop();
                    if(stack.size() == 1){
                        return -1;
                    }
                    int b = stack.pop();
                    stack.push(a - b);
                }
                break;
                default:
                    stack.push(Integer.valueOf(operation));

            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
//        System.out.println("Output: " + solution(3, 7));
        System.out.println("Output: " + stackSolution("5 6 + -"));
    }
}
