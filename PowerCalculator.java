import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number (positive integer): ");
        int number = sc.nextInt();

        System.out.print("Enter the exponent (positive integer): ");
        int power = sc.nextInt();

        // Checking if inputs are positive integers
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            int result = 1; 

            // Looping from 1 to power
            for (int i = 1; i <= power; i++) {
				// Multiplying result by number in each iteration
                result *= number; 
            }

            // Displaying the final result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
        sc.close(); 
    }
}
