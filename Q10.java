import java.util.Arrays;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nameOfStudents = new String[10];
        int n;

        System.out.print("Please enter the number of students (up to 10): ");
        n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        if (n < 1 || n > 10) {
            System.out.println("Please enter a number between 1 and 10.");
            return;
        }

        System.out.println("Enter the names of students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            nameOfStudents[i] = scanner.nextLine();
        }

        Arrays.sort(nameOfStudents, 0, n);

        System.out.println("\nSorted list of names:");
        for (int i = 0; i < n; i++) {
            System.out.println(nameOfStudents[i]);
        }

        scanner.close();
    }
}
