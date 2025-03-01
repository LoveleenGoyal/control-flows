import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            // Looping from 1 to the given number to find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) { // Checking divisibility
                    System.out.print(i + " ");
                }
            }
        }
        sc.close();
    }
}
