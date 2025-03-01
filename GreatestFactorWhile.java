import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the input is greater than 1
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            int greatestFactor = 1; 
            int counter = number - 1;

            // While loop to find the greatest factor
            while (counter >= 1) {
                if (number % counter == 0) { 
                    greatestFactor = counter;
					// Stop at the first (largest) factor found
                    break; 
                }
                counter--;
            }

            // Displaying the greatest factor
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }
        sc.close(); 
    }
}
