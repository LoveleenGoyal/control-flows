import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking salary as input
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        // Taking years of service as input
        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        // Checking if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // 5% bonus calculation
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus for employees with 5 or fewer years of service.");
        }

        sc.close(); 
    }
}
