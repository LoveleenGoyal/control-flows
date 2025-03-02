import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Initialize count variable
        int count = 0;
		// Store original number for reference
        int originalNumber = number; 

        // If number is 0, it has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (number != 0) {
                number /= 10; // Remove last digit
                count++; // Increase count
            }
        }

        // Display the number of digits
        System.out.println("The number of digits in " + originalNumber + " is: " + count);
        sc.close(); 
    }
}
