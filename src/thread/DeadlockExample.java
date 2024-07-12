package thread;

public class DeadlockExample {

    // Two resource objects
    private static final Object Resource1 = new Object();
    private static final Object Resource2 = new Object();

    public static void main(String[] args) {
        // Thread 1 tries to lock Resource1 then Resource2
        Thread thread1 = new Thread(() -> {
            synchronized (Resource1) {
                System.out.println("Thread 1: Locked Resource 1");

                try {
                    Thread.sleep(100); // Simulate some work (and give time for Thread 2 to lock Resource 2)
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                synchronized (Resource2) {
                    System.out.println("Thread 1: Locked Resource 2");
                }
            }
        });

        // Thread 2 tries to lock Resource2 then Resource1
        Thread thread2 = new Thread(() -> {
            synchronized (Resource2) {
                System.out.println("Thread 2: Locked Resource 2");

                try {
                    Thread.sleep(100); // Simulate some work (and give time for Thread 1 to lock Resource 1)
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                synchronized (Resource1) {
                    System.out.println("Thread 2: Locked Resource 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}


