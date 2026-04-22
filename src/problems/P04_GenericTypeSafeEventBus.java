package problems;

import java.util.function.Consumer;

/**
 * Problem:
 * Implement a type-safe in-memory EventBus using generics.
 *
 * Requirements:
 * 1) Register listeners by event class.
 * 2) Publish event to listeners of exact type.
 * 3) Support unregistering listeners.
 * 4) Avoid unsafe casts in public API.
 *
 * Hints:
 * - Keep a map from Class<?> to listeners.
 * - Use bounded generics: <T> with Class<T>.
 * - Internally you may need controlled casts with strong checks.
 */
public class P04_GenericTypeSafeEventBus {

    public <T> void subscribe(Class<T> eventType, Consumer<T> listener) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public <T> void unsubscribe(Class<T> eventType, Consumer<T> listener) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public <T> void publish(T event) {
        throw new UnsupportedOperationException("TODO: implement");
    }
}
