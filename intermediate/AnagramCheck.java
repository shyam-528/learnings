/**
 * 09 - AnagramCheck
 * Checks if two strings are anagrams (same letters, any order).
 * Ignores case and spaces: "Listen" vs "Silent" -> anagrams.
 *
 * Concepts: normalization, sorting char arrays, Arrays.equals.
 *
 * Run:
 *   javac AnagramCheck.java
 *   java AnagramCheck
 *
 * Sample I/O:
 *   First word: Listen
 *   Second word: Silent
 *   Anagrams!
 */
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    static boolean areAnagrams(String a, String b) {
        char[] x = a.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] y = b.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First word: ");
        String a = sc.nextLine();
        System.out.print("Second word: ");
        String b = sc.nextLine();

        System.out.println(areAnagrams(a, b) ? "Anagrams!" : "Not anagrams.");

        sc.close();
    }
}
