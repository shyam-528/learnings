/**
 * 12 - ProducerConsumer
 * One producer makes numbers, one consumer eats them, sharing a bounded
 * BlockingQueue. No manual synchronized/wait/notify needed.
 *
 * Concepts: BlockingQueue, put/take blocking, poison-pill shutdown.
 *
 * Run:
 *   javac ProducerConsumer.java
 *   java ProducerConsumer
 *
 * Sample output:
 *   Produced: 1 ... Consumed: 1 ... (interleaved)
 *   Done.
 */
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    private static final int POISON_PILL = -1; // shutdown signal

    static class Producer implements Runnable {
        private final BlockingQueue<Integer> queue;

        Producer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put(i); // blocks if queue is full
                    System.out.println("Produced: " + i);
                    Thread.sleep(100);
                }
                queue.put(POISON_PILL);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class Consumer implements Runnable {
        private final BlockingQueue<Integer> queue;

        Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    int item = queue.take(); // blocks if queue is empty
                    if (item == POISON_PILL) {
                        break;
                    }
                    System.out.println("Consumed: " + item);
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2); // small = shows blocking
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println("Done.");
    }
}
