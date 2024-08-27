import java.util.Scanner;

class Student {
    String name;
    String rollNo;
    float totalMarks;
}

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student s1 = new Student();
        
        System.out.println("Enter student details:");
        System.out.print("Enter student's name: ");
        s1.name = scanner.nextLine();
        
        System.out.print("Enter roll number: ");
        s1.rollNo = scanner.nextLine();
        
        System.out.print("Enter marks: ");
        s1.totalMarks = scanner.nextFloat();
        
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll Number: " + s1.rollNo);
        System.out.printf("Marks: %.2f\n", s1.totalMarks);
        
        scanner.close();
    }
}
