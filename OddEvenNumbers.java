import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number (positive integer): ");
        int number = sc.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {
            System.out.println("Odd and Even numbers from 1 to " + number + " are:");
            
            // Iterate from 1 to the given number
            for (int i = 1; i <= number; i++) {
                // Check if number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number.");
                } else {
                    System.out.println(i + " is an Odd number.");
                }
            }
        }

        sc.close();
    }
}
