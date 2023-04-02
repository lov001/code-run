package multithreading.basic;

public class ThreadLocalDemo {

    public static class MyRunnable implements Runnable {

        private final ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        @Override
        public void run() {
            threadLocal.set((int) (Math.random() * 50D));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error - " + e.getMessage());
            }
            System.out.println(threadLocal.get());
        }
    }

    public static void main(String[] args) {
        MyRunnable runnableInstance = new MyRunnable();
        Thread t1 = new Thread(runnableInstance);
        Thread t2 = new Thread(runnableInstance);
        // this will call run() method
        t1.start();
        t2.start();
    }
}
