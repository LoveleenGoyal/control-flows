import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check divisibility by 5
        boolean isDivisible = (number % 5 == 0);

        // Display result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close scanner
        sc.close();
    }
}

