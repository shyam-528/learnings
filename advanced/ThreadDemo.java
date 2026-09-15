/**
 * 11 - ThreadDemo
 * Runs two counting tasks concurrently with Threads + join, then the same
 * work with an ExecutorService. Shows why join (or shutdown+await) matters.
 *
 * Concepts: Thread, Runnable, start vs run, join, ExecutorService.
 *
 * Run:
 *   javac ThreadDemo.java
 *   java ThreadDemo
 *
 * Sample output:
 *   T1 counts: 1 2 3
 *   T2 counts: 1 2 3
 *   (order interleaves run to run)
 *   Pool tasks done.
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadDemo {

    static class Counter implements Runnable {
        private final String name;

        Counter(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            StringBuilder sb = new StringBuilder(name + " counts:");
            for (int i = 1; i <= 3; i++) {
                sb.append(" ").append(i);
                try {
                    Thread.sleep(50); // encourage interleaving
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println(sb);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Part 1: raw Threads.
        Thread t1 = new Thread(new Counter("T1"));
        Thread t2 = new Thread(new Counter("T2"));
        t1.start();
        t2.start();
        t1.join(); // wait for both before moving on
        t2.join();

        // Part 2: ExecutorService (preferred in real code).
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new Counter("Pool-A"));
        pool.submit(new Counter("Pool-B"));
        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Pool tasks done.");
    }
}
