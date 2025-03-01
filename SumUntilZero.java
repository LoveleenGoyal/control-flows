import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize total sum variable
        double total = 0.0;
        double number;

        // Start the loop
        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        while (number != 0) {
            total += number;  // Add number to total
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble(); // Take next input
        }

        // Print the total sum
        System.out.println("The total sum is: " + total);
    }
}
