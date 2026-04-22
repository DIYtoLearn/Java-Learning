package problems;

import java.util.List;

/**
 * Problem:
 * Implement producer-consumer pipeline with backpressure.
 *
 * Requirements:
 * 1) Producers generate items continuously.
 * 2) Consumers process slower than producers in some scenarios.
 * 3) System must not run out of memory under sustained load.
 * 4) Graceful shutdown with in-flight item handling.
 *
 * Hints:
 * - Use bounded queue or semaphore-based permits.
 * - Add stop signal / poison-pill strategy.
 * - Separate "submission rejected" from "processing failed".
 */
public class P08_ProducerConsumerWithBackpressure {

    public void start(int producerCount, int consumerCount, int queueCapacity) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public void stopGracefully() {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public List<String> metricsSnapshot() {
        throw new UnsupportedOperationException("TODO: optional metrics");
    }
}
