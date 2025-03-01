import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking user input for age
        System.out.print("Enter the person's age: ");
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close scanner
        sc.close();
    }
}
