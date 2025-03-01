import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize total sum variable
        double total = 0.0;

        // Infinite loop
        while (true) {
            // Take user input
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            // Check if number is 0 or negative to break the loop
            if (number <= 0) {
                break;
            }

            // Add number to total
            total += number;
        }

        // Print the total sum
        System.out.println("The total sum is: " + total);
    }
}
