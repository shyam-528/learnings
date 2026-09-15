/**
 * 13 - FileReadWrite
 * Writes lines to a file, reads them back, and appends one more line —
 * using java.nio.file (the modern I/O API).
 *
 * Concepts: Path/Paths, Files.write/readAllLines, StandardOpenOption,
 *           try-with-resources, IOException handling.
 *
 * Run:
 *   javac FileReadWrite.java
 *   java FileReadWrite
 *
 * Sample output:
 *   Wrote notes.txt
 *   --- file contents ---
 *   Java I/O is easy
 *   NIO beats old streams
 *   Appended line.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileReadWrite {
    public static void main(String[] args) {
        Path file = Paths.get("notes.txt");

        try {
            // 1. Write (creates or overwrites).
            Files.write(file, Arrays.asList("Java I/O is easy", "NIO beats old streams"));
            System.out.println("Wrote " + file);

            // 2. Append one line.
            Files.write(file, Arrays.asList("Appended line."), StandardOpenOption.APPEND);

            // 3. Read everything back.
            System.out.println("--- file contents ---");
            List<String> lines = Files.readAllLines(file);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
