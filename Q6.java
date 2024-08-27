import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns for the first matrix: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.print("Enter the number of rows and columns for the second matrix: ");
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        if (n != p) {
            System.out.println("Matrix multiplication not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            scanner.close();
            return;
        }

        int[][] first = new int[m][n];
        int[][] second = new int[p][q];
        int[][] result = new int[m][q];

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("First[" + i + "][" + j + "]: ");
                first[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print("Second[" + i + "][" + j + "]: ");
                second[i][j] = scanner.nextInt();
            }
        }

        // Initialize the result matrix to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                result[i][j] = 0;
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        // Print the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
