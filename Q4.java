import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        float avg;
        char grade;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        avg = (total * 100.0f) / 500;

        if (avg >= 90) {
            grade = 'O';
        } else if (avg >= 80 && avg < 90) {
            grade = 'A';
        } else if (avg >= 70 && avg < 80) {
            grade = 'B';
        } else if (avg >= 60 && avg < 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Total marks obtained = " + total);
        System.out.printf("Total percentage obtained = %.2f\n", avg);
        System.out.println("Grade obtained: " + grade);

        scanner.close();
    }
}
