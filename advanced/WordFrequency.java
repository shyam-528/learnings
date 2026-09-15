/**
 * 06 - WordFrequency
 * Counts word occurrences with a HashMap and prints the top 3 words.
 *
 * Concepts: HashMap, getOrDefault, sorting map entries, collections.
 *
 * Run:
 *   javac WordFrequency.java
 *   java WordFrequency
 *
 * Sample output (map order may vary):
 *   Frequencies: {java=2, powerful=1, learn=1, build=1, and=2, is=2, to=2, fun=3}
 *   Top 3: [fun=3, java=2, and=2]
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Java is fun and Java is powerful, fun to learn and fun to build";

        Map<String, Integer> freq = new HashMap<>();
        for (String word : text.toLowerCase().split("[^a-z]+")) {
            if (!word.isEmpty()) {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("Frequencies: " + freq);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Top 3: " + entries.subList(0, Math.min(3, entries.size())));
    }
}
