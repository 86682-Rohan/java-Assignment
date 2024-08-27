import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("'" + ch + "' is Lowercase");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("'" + ch + "' is a Number");
        } else {
            System.out.println("'" + ch + "' is Other characters");
        }

        scanner.close();
    }
}
