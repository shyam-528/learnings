/**
 * 04 - StackUsingArray
 * A generic stack backed by a resizable array: push, pop, peek.
 *
 * Concepts: generics, dynamic resizing, LIFO, custom exceptions.
 *
 * Run:
 *   javac StackUsingArray.java
 *   java StackUsingArray
 *
 * Sample output:
 *   Pushed: A, B, C
 *   Peek: C
 *   Popped: C, B
 *   Size: 1, Empty? false
 */
import java.util.Arrays;
import java.util.EmptyStackException;

public class StackUsingArray<T> {
    private static final int INITIAL_CAPACITY = 4;
    private Object[] elements = new Object[INITIAL_CAPACITY];
    private int size = 0;

    public void push(T item) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = (T) elements[--size];
        elements[size] = null; // avoid memory leak
        return item;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) elements[size - 1];
    }

    public boolean isEmpty() { return size == 0; }
    public int size()        { return size; }

    public static void main(String[] args) {
        StackUsingArray<String> stack = new StackUsingArray<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Pushed: A, B, C");
        System.out.println("Peek: " + stack.peek());
        System.out.println("Popped: " + stack.pop() + ", " + stack.pop());
        System.out.println("Size: " + stack.size() + ", Empty? " + stack.isEmpty());
    }
}
