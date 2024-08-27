import java.util.Scanner;

public class Q12{

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
        String originalString = scanner.nextLine();
        
        // Create a character array of the original string to reverse
        char[] strArray = originalString.toCharArray();

        // Reverse the character array
        reverseString(strArray);

        String reversedString = new String(strArray);

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
