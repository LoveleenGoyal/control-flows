import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize sum and store the original number
        int originalNumber = number;
        int sum = 0;

        // Use while loop to process each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            sum += digit * digit * digit;    // Add cube of the digit to sum
            originalNumber /= 10;            // Remove last digit from originalNumber
        }

        // Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
        sc.close();
    }
}
