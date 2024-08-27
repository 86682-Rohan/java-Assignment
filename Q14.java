import java.util.Scanner;

public class Q14 {

    public static void reverseString(char[] str) {
        int start = 0;
        int end = str.length - 1;
        char temp;

        while (start < end) {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String originalString = scanner.nextLine().trim();  // Remove leading and trailing spaces

        char[] strArray = originalString.toCharArray();
        char[] reversedArray = strArray.clone();  // Clone the original array

        reverseString(reversedArray);

        String reversedString = new String(reversedArray);

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);

        if (originalString.equals(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
