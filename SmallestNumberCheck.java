import java.util.Scanner;

public class SmallestNumberCheck {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking user input for three numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // Check if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Display result
        System.out.println("Is the first number the smallest? " + isSmallest);

        // Close scanner
        sc.close();
    }
}
