import java.util.Scanner;

public class FactorsFinderWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            int i = 1; 

            // Looping while counter is less than or equal to the number
            while (i <= number) {
                if (number % i == 0) { 
                    System.out.print(i + " ");
                }
                i++; 
            }
        }
        sc.close(); 
    }
}
