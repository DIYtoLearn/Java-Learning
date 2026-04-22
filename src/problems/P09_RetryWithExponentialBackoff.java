package problems;

import java.time.Duration;
import java.util.concurrent.Callable;

/**
 * Problem:
 * Implement generic retry utility with exponential backoff and jitter.
 *
 * Requirements:
 * 1) Retry failed operation up to maxAttempts.
 * 2) Delay progression: baseDelay * 2^attempt.
 * 3) Add random jitter to avoid thundering herd.
 * 4) Allow filtering retryable vs non-retryable exceptions.
 *
 * Hints:
 * - Design a RetryPolicy object.
 * - Use interruption-aware sleeping.
 * - Preserve original exception cause chain clearly.
 */
public class P09_RetryWithExponentialBackoff {

    public static final class RetryPolicy {
        public RetryPolicy(int maxAttempts, Duration baseDelay, double jitterFraction) {
            throw new UnsupportedOperationException("TODO: implement");
        }
    }

    public static <T> T execute(Callable<T> task, RetryPolicy policy) throws Exception {
        throw new UnsupportedOperationException("TODO: implement");
    }
}
