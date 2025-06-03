import java.util.LinkedHashMap;
import java.util.Map;

public class Caching {
    public static void main(String[] args) {
        class LRUCache<K, V> extends LinkedHashMap<K, V> {
            private final int capacity;

            public LRUCache(int capacity) {
                super(capacity, 0.75f, true); // accessOrder = true
                this.capacity = capacity;
            }

            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        }

        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.get(1);
        cache.put(4, "D"); // Removes key 2

        System.out.println(cache.keySet()); // [3, 1, 4]
    }
}
