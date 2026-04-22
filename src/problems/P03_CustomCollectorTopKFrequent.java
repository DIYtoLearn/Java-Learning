package problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

/**
 * Problem:
 * Create a custom Stream Collector that returns top-K frequent words.
 *
 * Requirements:
 * 1) Input is a stream of strings.
 * 2) Count frequencies case-insensitively.
 * 3) Return top K words sorted by:
 *    - descending frequency
 *    - lexicographical order as tie-breaker
 * 4) Collector should work for sequential and parallel streams.
 *
 * Hints:
 * - Collector parts: supplier, accumulator, combiner, finisher.
 * - Use a mutable map in intermediate state.
 * - In finisher, build sorted result with a bounded structure or sorting.
 */
public class P03_CustomCollectorTopKFrequent {

    public static Collector<String, ?, List<String>> topKFrequentCollector(int k) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public static Map<String, Integer> debugFrequencyMap(List<String> words) {
        throw new UnsupportedOperationException("TODO: optional helper");
    }
}
