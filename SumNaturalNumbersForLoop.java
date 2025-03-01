import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for n
        System.out.print("Enter a natural number (positive integer): ");
        int n = sc.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using formula: n * (n + 1) / 2
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Display the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Compare both results
            if (formulaSum == loopSum) {
                System.out.println("Both computations match! The result is correct.");
            } else {
                System.out.println("There is a mismatch in calculations.");
            }
        }
    }
}
