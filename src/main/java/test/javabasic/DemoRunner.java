package test.javabasic;

public class DemoRunner extends Parent{

    void msg() {
        System.out.println("Child");
    }

    public void msg1() {
        System.out.println("Test Child");
    }

    public static void main(String[] args) {
        Parent obj = new DemoRunner();
//        obj.msg1();
        ((DemoRunner) obj).msg1();
    }
}

class Parent {

    void msg() {
        System.out.println("Parent");
    }

}