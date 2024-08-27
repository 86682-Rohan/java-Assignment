import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setSalary(double salary) {
        this.monthlySalary = salary;
    }

    public void display() {
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.printf("Monthly Salary: %.2f%n", monthlySalary);
        System.out.printf("Yearly Salary: %.2f%n", monthlySalary * 12);
    }
    public void giveRaise(double percentage) {
        this.monthlySalary += this.monthlySalary * (percentage / 100);
    }
}

public class Q11 {

    // Method to initialize Employee details using Scanner
    public static Employee empInit(Scanner scanner) {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character left after nextDouble()

        return new Employee(firstName, lastName, monthlySalary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the first employee:");
        Employee emp1 = empInit(scanner);

        System.out.println("Enter details for the second employee:");
        Employee emp2 = empInit(scanner);

        System.out.println("\nInitial Salaries:");
        emp1.display();
        emp2.display();

        // Give a 10% raise to each employee
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("\nSalaries after 10% raise:");
        emp1.display();
        emp2.display();

        scanner.close();
    }
}
