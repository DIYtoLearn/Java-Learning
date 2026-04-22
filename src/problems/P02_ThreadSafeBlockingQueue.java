package problems;

/**
 * Problem:
 * Implement a bounded thread-safe blocking queue.
 *
 * Requirements:
 * 1) enqueue blocks when queue is full.
 * 2) dequeue blocks when queue is empty.
 * 3) Multiple producer and consumer threads must be supported safely.
 * 4) No busy waiting (spin loops) allowed.
 *
 * Hints:
 * - Use wait/notifyAll with synchronized OR ReentrantLock + Condition.
 * - Guard all shared state with the same lock.
 * - Recheck conditions in while loops after wake-up.
 */
public class P02_ThreadSafeBlockingQueue<T> {

    public P02_ThreadSafeBlockingQueue(int capacity) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public void enqueue(T item) throws InterruptedException {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public T dequeue() throws InterruptedException {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public int size() {
        throw new UnsupportedOperationException("TODO: implement");
    }
}
