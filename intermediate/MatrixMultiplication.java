/**
 * 12 - MatrixMultiplication
 * Multiplies matrix A (m x n) by matrix B (n x p) -> result (m x p).
 *
 * Concepts: 2D arrays, triple nested loop, dimension compatibility.
 *
 * Run:
 *   javac MatrixMultiplication.java
 *   java MatrixMultiplication
 *
 * Sample I/O:
 *   A rows/cols: 2 3
 *   A values: 1 2 3 4 5 6
 *   B rows/cols: 3 2
 *   B values: 7 8 9 10 11 12
 *   Result:
 *   58 64
 *   139 154
 */
import java.util.Scanner;

public class MatrixMultiplication {

    static int[][] multiply(int[][] a, int[][] b) {
        int m = a.length, n = a[0].length, p = b[0].length;
        int[][] c = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    static int[][] readMatrix(Scanner sc, String name, int rows, int cols) {
        System.out.print(name + " values: ");
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A rows/cols: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = readMatrix(sc, "A", m, n);

        System.out.print("B rows/cols: ");
        int n2 = sc.nextInt();
        int p = sc.nextInt();
        if (n2 != n) {
            System.out.println("Cannot multiply: A cols (" + n + ") != B rows (" + n2 + ").");
            sc.close();
            return;
        }
        int[][] b = readMatrix(sc, "B", n2, p);

        System.out.println("Result:");
        for (int[] row : multiply(a, b)) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + (j < row.length - 1 ? " " : "\n"));
            }
        }

        sc.close();
    }
}
