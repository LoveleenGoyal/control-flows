import java.util.Scanner;

public class SumOfNaturalNumbers {
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

            // Compute sum using while loop
            int loopSum = 0;
            int i = 1; 
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Display the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            // Compare both results
            if (formulaSum == loopSum) {
                System.out.println("Both computations match! The result is correct.");
            } else {
                System.out.println("There is a mismatch in calculations.");
            }
        }
    }
}
