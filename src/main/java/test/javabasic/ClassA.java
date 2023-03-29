package test.javabasic;

public class ClassA implements Runnable {

    static int add(int i, int j) {
        return i + j;
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        Thread thread = new Thread(obj);
        thread.run();
    }

    @Override
    public void run() {
        System.out.println("Thread running");
    }
}

