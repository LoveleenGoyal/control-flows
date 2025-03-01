import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number >= 1) {
            // Calculate the sum of n natural numbers
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close scanner
        sc.close();
    }
}
