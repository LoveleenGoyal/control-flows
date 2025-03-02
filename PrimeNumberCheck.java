import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Prime numbers must be greater than 1
        boolean isPrime = number > 1;

        // Check divisibility from 2 to number-1
        for (int i = 2; i <= Math.sqrt(number); i++) {
			// If divisible by any number, it's not prime
            if (number % i == 0) {  
                isPrime = false;
                break;  
            }
        }

        // Print whether the number is prime or not
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
        sc.close(); 
    }
}
