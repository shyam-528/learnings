/**
 * 10 - CountWords
 * Counts words, characters (with/without spaces), and lines in entered text.
 * Type all lines, then submit an empty line to finish.
 *
 * Concepts: nextLine, split with regex, trim, isEmpty.
 *
 * Run:
 *   javac CountWords.java
 *   java CountWords
 *
 * Sample I/O:
 *   Enter text (empty line to finish):
 *   > Hello world
 *   > Java is fun
 *   >
 *   Lines: 2, Words: 5, Chars (with spaces): 22
 */
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text (empty line to finish):");
        int lines = 0, words = 0, chars = 0;
        while (true) {
            System.out.print("> ");
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            lines++;
            chars += line.length();
            String trimmed = line.trim();
            if (!trimmed.isEmpty()) {
                words += trimmed.split("\\s+").length;
            }
        }

        System.out.println("Lines: " + lines + ", Words: " + words + ", Chars (with spaces): " + chars);
        sc.close();
    }
}
