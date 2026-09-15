/**
 * 07 - LRUCacheDemo
 * A Least-Recently-Used cache built on LinkedHashMap (access order).
 * When full, the stalest entry is evicted automatically.
 *
 * Concepts: LinkedHashMap, removeEldestEntry, access-order maps.
 *
 * Run:
 *   javac LRUCacheDemo.java
 *   java LRUCacheDemo
 *
 * Sample output:
 *   Cache: {1=one, 2=two, 3=three}
 *   After touching 1 and adding 4: {3=three, 1=one, 4=four}
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheDemo<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCacheDemo(int capacity) {
        super(capacity, 0.75f, true); // true = access order
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCacheDemo<Integer, String> cache = new LRUCacheDemo<>(3);
        cache.put(1, "one");
        cache.put(2, "two");
        cache.put(3, "three");
        System.out.println("Cache: " + cache);

        cache.get(1);        // touch key 1 -> now most recent
        cache.put(4, "four"); // evicts key 2 (least recently used)
        System.out.println("After touching 1 and adding 4: " + cache);
    }
}
