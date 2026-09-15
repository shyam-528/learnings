/**
 * 14 - SerializationDemo
 * Saves a Player object to disk and loads it back. The transient
 * sessionToken is NOT saved — proving what transient means.
 *
 * Concepts: Serializable, serialVersionUID, transient, Object streams,
 *           try-with-resources.
 *
 * Run:
 *   javac SerializationDemo.java
 *   java SerializationDemo
 *
 * Sample output:
 *   Saved: Player{name='Asha', highScore=9500}
 *   Loaded: Player{name='Asha', highScore=9500}
 *   Token after load (transient, lost): null
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

    static class Player implements Serializable {
        private static final long serialVersionUID = 1L;

        private String name;
        private int highScore;
        private transient String sessionToken; // never serialized

        Player(String name, int highScore, String sessionToken) {
            this.name = name;
            this.highScore = highScore;
            this.sessionToken = sessionToken;
        }

        @Override
        public String toString() {
            return "Player{name='" + name + "', highScore=" + highScore + "}";
        }
    }

    public static void main(String[] args) {
        String file = "player.ser";
        Player original = new Player("Asha", 9500, "token-abc-123");

        // Save.
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(original);
            System.out.println("Saved: " + original);
        } catch (IOException e) {
            System.out.println("Save failed: " + e.getMessage());
            return;
        }

        // Load.
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            Player loaded = (Player) in.readObject();
            System.out.println("Loaded: " + loaded);
            System.out.println("Token after load (transient, lost): " + loaded.sessionToken);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Load failed: " + e.getMessage());
        }
    }
}
