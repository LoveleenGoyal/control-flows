import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take salary input from user
        System.out.print("Enter the employee's salary (INR): ");
        double salary = sc.nextDouble();

        // Take years of service input from user
        System.out.print("Enter the years of service: ");
        int yearsOfService = sc.nextInt();

        // Check if the employee has more than 5 years of service
        if (yearsOfService > 5) {
            // Calculate bonus (5% of salary)
            double bonus = salary * 0.05;
            System.out.println("The employee is eligible for a bonus of INR " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        sc.close();
    }
}
