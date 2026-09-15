/**
 * 11 - MatrixAddition
 * Adds two matrices of the same dimensions.
 *
 * Concepts: 2D arrays, nested loops, dimension validation.
 *
 * Run:
 *   javac MatrixAddition.java
 *   java MatrixAddition
 *
 * Sample I/O:
 *   Rows and cols: 2 2
 *   Matrix A: 1 2 3 4
 *   Matrix B: 5 6 7 8
 *   Sum:
 *   6 8
 *   10 12
 */
import java.util.Scanner;

public class MatrixAddition {

    static int[][] add(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    static int[][] readMatrix(Scanner sc, String name, int rows, int cols) {
        System.out.print("Matrix " + name + ": ");
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    static void print(int[][] m) {
        for (int[] row : m) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + (j < row.length - 1 ? " " : "\n"));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rows and cols: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = readMatrix(sc, "A", rows, cols);
        int[][] b = readMatrix(sc, "B", rows, cols);

        System.out.println("Sum:");
        print(add(a, b));

        sc.close();
    }
}
