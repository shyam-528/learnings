/**
 * 09 - GenericsBox
 * A generic Box<T> plus a generic max() method that works for any Comparable.
 * Also shows bounded wildcards (Box<? extends Number>).
 *
 * Concepts: generic classes, generic methods, bounded types, wildcards.
 *
 * Run:
 *   javac GenericsBox.java
 *   java GenericsBox
 *
 * Sample output:
 *   String box: hello
 *   Integer box: 42
 *   Max of 7 and 13: 13
 *   Sum of number boxes: 15.0
 */
import java.util.Arrays;
import java.util.List;

public class GenericsBox<T> {
    private T value;

    public GenericsBox(T value) {
        this.value = value;
    }

    public T get()          { return value; }
    public void set(T value) { this.value = value; }

    @Override
    public String toString() { return String.valueOf(value); }

    /** Generic method: max of two comparables of the same type. */
    public static <T extends Comparable<T>> T max(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }

    /** Bounded wildcard: accepts a list of boxes holding any kind of Number. */
    public static double sumOfBoxes(List<? extends GenericsBox<? extends Number>> boxes) {
        double sum = 0;
        for (GenericsBox<? extends Number> box : boxes) {
            sum += box.get().doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        GenericsBox<String> s = new GenericsBox<>("hello");
        GenericsBox<Integer> n = new GenericsBox<>(42);
        System.out.println("String box: " + s);
        System.out.println("Integer box: " + n);
        System.out.println("Max of 7 and 13: " + max(7, 13));

        List<GenericsBox<Integer>> intBoxes = Arrays.asList(
                new GenericsBox<>(5), new GenericsBox<>(10));
        System.out.println("Sum of number boxes: " + sumOfBoxes(intBoxes));
    }
}
