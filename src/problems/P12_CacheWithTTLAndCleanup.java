package problems;

import java.time.Duration;
import java.util.Optional;

/**
 * Problem:
 * Implement an in-memory key-value cache with TTL expiration.
 *
 * Requirements:
 * 1) put(key, value, ttl) stores entry with expiry time.
 * 2) get(key) returns empty if missing or expired.
 * 3) Background cleanup thread removes expired entries periodically.
 * 4) Thread-safe operations for concurrent readers/writers.
 *
 * Hints:
 * - Store value + expiry metadata per key.
 * - Use ConcurrentHashMap.
 * - For cleanup, ScheduledExecutorService is useful.
 */
public class P12_CacheWithTTLAndCleanup<K, V> {

    public P12_CacheWithTTLAndCleanup(Duration cleanupInterval) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public void put(K key, V value, Duration ttl) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public Optional<V> get(K key) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public void shutdown() {
        throw new UnsupportedOperationException("TODO: implement");
    }
}
