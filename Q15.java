import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        int[] count = new int[26];  // Array to hold frequency of each letter

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toUpperCase(input.charAt(i));  // Convert to uppercase
            if (Character.isLetter(ch)) {
                count[ch - 'A']++;  // Increment the count for the respective letter
            }
        }

        System.out.println("Output:");
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'A') + " : " + count[i]);
            }
        }

        scanner.close();
    }
}
