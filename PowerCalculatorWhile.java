import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
t
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the exponent (power): ");
        int power = sc.nextInt();

        // Checking if power is a non-negative integer
        if (power < 0) {
            System.out.println("Please enter a non-negative integer for the exponent.");
        } else {
            int result = 1; 
            int counter = 0; 

            // While loop to calculate power
            while (counter < power) {
				// Multiplying result by number
                result *= number; 
                counter++; 
            }

            // Displaying the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
        sc.close(); 
    }
}
