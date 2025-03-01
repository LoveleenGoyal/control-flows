import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1; // Initializing counter

            // Looping from 1 to the entered number
            while (i <= number) {
                // Checking conditions for Fizz, Buzz, and FizzBuzz
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; // Incrementing counter
            }
        }
        sc.close(); 
    }
}

