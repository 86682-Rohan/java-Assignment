import java.util.Scanner;

public class Q9 {

    public static void binary(int x) {
        StringBuilder binaryNum = new StringBuilder();
        
        if (x == 0) {
            binaryNum.append("0");
        } else {
            while (x > 0) {
                binaryNum.append(x % 2);
                x = x / 2;
            }
        }

        System.out.print("\nBinary Equivalent: ");
        System.out.println(binaryNum.reverse().toString());
    }

    public static void octal(int x) {
        if (x >= 8) {
            octal(x / 8);
        }
        System.out.print(x % 8);
    }

    public static void hexadecimal(int x) {
        if (x >= 16) {
            hexadecimal(x / 16);
        }
        int remainder = x % 16;
        if (remainder < 10) {
            System.out.print(remainder);
        } else {
            System.out.print((char) ('A' + remainder - 10));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Given Number: " + a);

        binary(a);

        System.out.print("Octal Equivalent: ");
        octal(a);
        System.out.println();

        System.out.print("Hexadecimal Equivalent: ");
        hexadecimal(a);
        System.out.println();

        scanner.close();
    }
}
