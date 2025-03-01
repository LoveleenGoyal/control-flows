import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Checking if the input is valid
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
			// Starting from 99 (since we need numbers below 100)
            int counter = 99; 

            // While loop to find multiples
            while (counter >= 1) {
                if (counter % number == 0) { 
                    System.out.print(counter + " ");
                }
                counter--; 
            }
        }
        sc.close(); 
    }
}
