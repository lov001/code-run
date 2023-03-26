package multithreading.basic;

public class BasicThreadExtension extends Thread {

    public void run() {
        System.out.println("Thread is running now......");
    }

    public static void main(String[] args) {
        BasicThreadExtension obj = new BasicThreadExtension();
        obj.start();
    }
}
