import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Looping from 1 to the entered number
            for (int i = 1; i <= number; i++) {
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
            }
        }

        sc.close();
    }
}
