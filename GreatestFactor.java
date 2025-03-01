import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the input is positive
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            int greatestFactor = 1; 

            // Loop from number - 1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) { 
                    greatestFactor = i;
					// Stop at the first (largest) factor found
                    break; 
                }
            }

            // Displaying the greatest factor
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }
        sc.close(); 
    }
}
