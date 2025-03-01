import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize factorial result
            long factorial = 1;
            int i = number; // Start from the given number

            // Compute factorial using while loop
            while (i > 0) {
                factorial *= i;
                i--;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}
