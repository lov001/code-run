package multithreading.basic;

public class BasicThreadImplements implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running now using runnable interface......");
    }

    public static void main(String[] args) {
        BasicThreadImplements obj = new BasicThreadImplements();
        Thread thread = new Thread(obj);
        System.out.println(thread.getName());
        System.out.println(thread.getThreadGroup());
        thread.start();
    }
}
