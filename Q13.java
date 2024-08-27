import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character left by nextInt()

        String[] strings = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        boolean foundDuplicate = false;

        System.out.println("Duplicate strings in the array are:");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (strings[i].equals(strings[j])) {
                    System.out.println(strings[i]);
                    foundDuplicate = true;
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }

        scanner.close();
    }
}
