package problems;

import java.util.Map;

/**
 * Problem:
 * Design and implement an LRU (Least Recently Used) Cache.
 *
 * Requirements:
 * 1) Constructor takes positive capacity.
 * 2) get(key) returns value if present, else -1.
 * 3) put(key, value) inserts/updates key.
 * 4) If capacity exceeded, evict least recently used key.
 * 5) Both get and put should run in O(1) average time.
 *
 * Hints:
 * - Combine a HashMap with a doubly linked list.
 * - Move accessed/updated nodes to the "most recent" end.
 * - Keep dummy head and tail nodes to simplify pointer operations.
 */
public class P01_LRUCacheDesign {

    public static class LRUCache {
        public LRUCache(int capacity) {
            throw new UnsupportedOperationException("TODO: implement");
        }

        public int get(int key) {
            throw new UnsupportedOperationException("TODO: implement");
        }

        public void put(int key, int value) {
            throw new UnsupportedOperationException("TODO: implement");
        }

        public Map<Integer, Integer> snapshot() {
            throw new UnsupportedOperationException("TODO: optional debug helper");
        }
    }
}
